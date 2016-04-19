package net.sandius.rembulan.bm;

import net.sandius.rembulan.core.Coroutine;
import net.sandius.rembulan.core.LuaState;
import net.sandius.rembulan.core.PreemptionContext;
import net.sandius.rembulan.core.Table;
import net.sandius.rembulan.core.TableFactory;
import net.sandius.rembulan.core.impl.DefaultTable;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class DummyLuaState extends LuaState {

	private final PreemptionContext preemptionContext;

	public DummyLuaState() {
		this.preemptionContext = PreemptionContext.Never.INSTANCE;
	}

	@Override
	public Table nilMetatable() {
		return null;
	}

	@Override
	public Table booleanMetatable() {
		return null;
	}

	@Override
	public Table numberMetatable() {
		return null;
	}

	@Override
	public Table stringMetatable() {
		return null;
	}

	@Override
	public Table functionMetatable() {
		return null;
	}

	@Override
	public Table threadMetatable() {
		return null;
	}

	@Override
	public Table lightuserdataMetatable() {
		return null;
	}

	@Override
	public TableFactory tableFactory() {
		return DefaultTable.FACTORY_INSTANCE;
	}

	@Override
	public PreemptionContext preemptionContext() {
		return preemptionContext;
	}

	@Override
	public Coroutine getCurrentCoroutine() {
		return null;
	}

}
