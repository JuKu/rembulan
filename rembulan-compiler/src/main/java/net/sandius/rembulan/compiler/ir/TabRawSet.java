/*
 * Copyright 2016 Miroslav Janíček
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.sandius.rembulan.compiler.ir;

import net.sandius.rembulan.util.Check;

// FIXME: remove code duplication
public class TabRawSet extends BodyNode {

	private final Val obj;
	private final Val key;
	private final Val value;

	public TabRawSet(Val obj, Val key, Val value) {
		this.obj = Check.notNull(obj);
		this.key = Check.notNull(key);
		this.value = Check.notNull(value);
	}

	public Val obj() {
		return obj;
	}

	public Val key() {
		return key;
	}

	public Val value() {
		return value;
	}

	@Override
	public void accept(IRVisitor visitor) {
		visitor.visit(this);
	}

}