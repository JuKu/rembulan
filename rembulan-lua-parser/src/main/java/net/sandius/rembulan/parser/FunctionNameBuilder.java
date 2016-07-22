package net.sandius.rembulan.parser;

import net.sandius.rembulan.parser.ast.LValueExpr;
import net.sandius.rembulan.parser.ast.Name;
import net.sandius.rembulan.parser.ast.SourceInfo;
import net.sandius.rembulan.parser.ast.StringLiteral;
import net.sandius.rembulan.util.Check;

class FunctionNameBuilder {

	private LValueExpr lv;
	private boolean method;

	public FunctionNameBuilder(SourceElement<Name> srcName) {
		Check.notNull(srcName);
		this.lv = Exprs.var(srcName.sourceInfo(), srcName.element());
		this.method = false;
	}

	public void addDotName(SourceInfo srcDot, SourceElement<Name> srcName) {
		Check.notNull(srcDot);
		Check.notNull(srcName);
		lv = Exprs.index(srcDot, lv, Exprs.literal(srcName.sourceInfo(), StringLiteral.fromName(srcName.element())));
	}

	public void addColonName(SourceInfo srcColon, SourceElement<Name> srcName) {
		addDotName(srcColon, srcName);
		method = true;
	}

	public boolean isMethod() {
		return method;
	}

	public LValueExpr get() {
		return lv;
	}

}