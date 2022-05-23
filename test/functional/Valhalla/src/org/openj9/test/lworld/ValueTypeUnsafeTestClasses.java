/*******************************************************************************
 * Copyright (c) 2021, 2022 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package org.openj9.test.lworld;


public class ValueTypeUnsafeTestClasses {

	static primitive class ValueTypeInt {
		ValueTypeInt(int i) { this.i = i; }
		final int i;
	}

	static primitive class ValueTypeLong {
		ValueTypeLong(long l) {this.l = l;}
		final long l;
	}

	static primitive class ValueTypePoint2D {
		final ValueTypeInt x, y;

		ValueTypePoint2D(ValueTypeInt x, ValueTypeInt y) {
			this.x = x;
			this.y = y;
		}
	}

	static class IntWrapper {
		IntWrapper(int i) { this.vti = new ValueTypeInt(i); }
		final ValueTypeInt vti;
	}

	static class Point2D {
		final int x, y;

		Point2D(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static primitive class ValueTypeWithLongField {
		final ValueTypeLong l;

		ValueTypeWithLongField() {
			l = new ValueTypeLong(1);
		}
	}

	static primitive class ValueTypeLongPoint2D {
		final ValueTypeLong x, y;

		ValueTypeLongPoint2D(long x, long y) {
			this.x = new ValueTypeLong(x);
			this.y = new ValueTypeLong(y);
		}
	}

	static primitive class ZeroSizeValueType {
		ZeroSizeValueType() {}
	}

	static primitive class ZeroSizeValueTypeWrapper {
		final ZeroSizeValueType z;

		ZeroSizeValueTypeWrapper() {
			z = new ZeroSizeValueType();
		}
	}

	static primitive class ValueTypeInt2 {
		ValueTypeInt2(int i) { this.i = i; }
		final int i;
	}
}
