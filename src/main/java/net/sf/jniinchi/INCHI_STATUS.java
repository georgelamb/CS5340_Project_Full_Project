/*
 * Copyright 2006-2011 Sam Adams <sea36 at users.sourceforge.net>
 *
 * This file is part of JNI-InChI.
 *
 * JNI-InChI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JNI-InChI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JNI-InChI.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.jniinchi;

/**
 * @author sea36
 */
public enum INCHI_STATUS {

    VALID_STANDARD(0),
    VALID_NON_STANDARD(-1),
    INVALID_PREFIX(1),
    INVALID_VERSION(2),
    INVALID_LAYOUT(3),
    FAIL_I2I(4);

    /**
     * Internal InChI index (from inchi_api.h).
     */
    private final int indx;

    /**
     * Constructor.
     */
    private INCHI_STATUS(final int indx) {
        this.indx = indx;
    }

    public int getIndx() {
        return indx;
    }

    public static INCHI_STATUS getValue(int value) {
        switch (value) {
            case -1:
                return VALID_NON_STANDARD;
            case 0:
                return VALID_STANDARD;
            case 1:
                return INVALID_PREFIX;
            case 2:
                return INVALID_VERSION;
            case 3:
                return INVALID_LAYOUT;
            case 4:
                return FAIL_I2I;
            default:
                return null;
        }
    }

}
