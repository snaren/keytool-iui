/*
 *
 * Copyright (c) 2001-2002 keyTool IUI Project.
 * LGPL License.
 * http://code.google.com/p/keytool-iui/
 *
 *
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of keyTool IUI Project's license agreement.
 *
 * THE SOFTWARE IS PROVIDED AND LICENSED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. 
 *
 * LICENSE FOR THE SOFTWARE DOES NOT INCLUDE ANY CONSIDERATION FOR ASSUMPTION OF RISK
 * BY KEYTOOL IUI PROJECT, AND KEYTOOL IUI PROJECT DISCLAIMS ANY AND ALL LIABILITY FOR INCIDENTAL
 * OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF OR INABILITY
 * TO USE THE SOFTWARE, EVEN IF KEYTOOL IUI PROJECT HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. 
 *
 */

package com.google.code.p.keytooliui.beans.panel;


import java.beans.*;

/**
    get and set properties, used for reflection
    
    known subclasses:
    . PMediaRtpAudioBeanInfo
    . PMediaRtpVideoAbsBeanInfo
    
**/
abstract public class PMediaRtpAbsBeanInfo extends PMediaAbsBeanInfo 
{
    // ------
    // PUBLIC
    
    protected PropertyDescriptor[] _getPropertyDescriptors_(PropertyDescriptor[] pdrsSub) 
    {
        int intShift = pdrsSub.length;
        
	    PropertyDescriptor pdrs[] = new PropertyDescriptor[intShift + 4];
	    
	    try 
	    {
	        for (int i=0; i<intShift; i++)
	            pdrs[i] = pdrsSub[i];
	        
	        // mandatory
	        pdrs[intShift] = new PropertyDescriptor("transmitterIP", super._clsBean_); intShift++;
	        pdrs[intShift] = new PropertyDescriptor("transmitterPort", super._clsBean_); intShift++;
	        pdrs[intShift] = new PropertyDescriptor("timeToLive", super._clsBean_); intShift ++;
	        // optional
	        pdrs[intShift] = new PropertyDescriptor("timeToWait", super._clsBean_); intShift ++; // ++ not needed
	        
	        return pdrs;
	    } 
	    
	    catch (Exception exc) 
	    {
	        exc.printStackTrace();
	        return null;
	    }
    }
    
    
    // ---------
    // PROTECTED
    
    
    protected PMediaRtpAbsBeanInfo(
        Class clsBean,
        String strName
        ) 
    {
        super(clsBean, strName);
    }
}