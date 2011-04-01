/*
 *
 * Copyright (c) 2001-2011 keyTool IUI Project.
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

package com.google.code.p.keytooliui.beans.button;

/**
    a button displayed as a label, while clicked: open up a secondary window
    
    "B" for "Button"
    "Sw" for "Secondary Window"
    "Url" for "Uniform Resource Locator"
    "Media" means window displays a page of type "media", JMF's related
    "Video" format: AVI, MPEG-1, QT, H.261, H.263
                    ?Flash 2?, ?HotMedia? 

**/


import com.google.code.p.keytooliui.shared.lang.*;
import com.google.code.p.keytooliui.shared.swing.frame.*;

import javax.swing.*;

import java.net.*;

final public class B2SwUrlMediaVideo extends B2SwUrlMediaAbs 
{
    // ------
    // PUBLIC
    
    public B2SwUrlMediaVideo()
    {
        super();
    }
    
    // ---------
    // PROTECTED
    
    protected boolean _createWindow_()
    {
        String strMethod = "_createWindow_()";
        
        URL url = super._getUrl_();
        
        if (url == null)
        {
            MySystem.s_printOutError(this, strMethod, "nil url");
            return false;
        }
        
        JFrame frmOwner = B2SwAbs._s_getFrameOwnerHelpSet_(this);
        
        if (frmOwner == null)
        {
            MySystem.s_printOutError(this, strMethod, "nil frmOwner");
            return false;
        }
      
        
        
        // --
        
        super._frmWindow_ = 
            new FSwUrlMediaVideo(
                (java.awt.Window) frmOwner, // tempo
                super.getWindowTitle(), 
                super._getImageIconFrameTarget_(),
                url); 
        
        return true;
    }
}