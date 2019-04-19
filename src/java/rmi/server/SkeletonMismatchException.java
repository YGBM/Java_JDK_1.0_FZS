/*
 * @(#)SkeletonMismatchException.java	1.4 98/08/12
 *
 * Copyright 1995-1998 by Sun Microsystems, Inc.,
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of Sun Microsystems, Inc. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with Sun.
 */

package java.rmi.server;

import java.rmi.RemoteException;

/**
 * This exception is thrown when a call is received that does not
 * match the available skeleton.  It indicates either that the
 * remote method names or signatures in this interface have changed or
 * that the stub class used to make the call and the skeleton
 * receiving the call were not generated by the same version of
 * the stub compiler (RMIC).
 */
public class SkeletonMismatchException extends RemoteException {

    private static final long serialVersionUID = -7780460454818859281L;

    /**
     * Create a new SkeletonMismatchException exception with a descriptive string.  */
    public SkeletonMismatchException(String s) {
	super(s);
    }

}
