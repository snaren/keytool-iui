/*
 *
 * Copyright (c) 2001-2011 keyTool IUI Project.
 * LGPL License.
 * http://code.google.com/p/keytool-iui/
 *
 * This software is the confidential and proprietary information of RagingCat Project.
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of RagingCat Project's license agreement.
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
 
 
package com.google.code.p.keytooliui.shared.swing.button;

/*

    known subclasses:
    . BESAboutAppli24

*/


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.google.code.p.keytooliui.shared.lang.*;
import com.google.code.p.keytooliui.shared.swing.dialog.DHelpAboutAppli;
import com.google.code.p.keytooliui.shared.swing.menuitem.MIHelpAboutAppliAbstract;
import com.google.code.p.keytooliui.shared.swing.panel.PTabHelpAppliAdvancedAbs;

abstract public class BESAboutAppliAbs extends BEnabledState
{    
    // --------------
    // STATIC PRIVATE
    
    static private String _s_strToolTipTextPrefix = null;
    
    // ------------------
    // STATIC INITIALIZER

    static
    {
    
        String strBundleFileShort =
            com.google.code.p.keytooliui.shared.Shared.f_s_strBundleDir +
            ".BESAboutAppliAbs" // class name
            ;
    
        
        
        String strWhere = "com.google.code.p.keytooliui.shared.swing.button.BESAboutAppliAbs";
        
        try
        {
            java.util.ResourceBundle rbeResources = java.util.ResourceBundle.getBundle(strBundleFileShort, 
                java.util.Locale.getDefault());
                
            _s_strToolTipTextPrefix = rbeResources.getString("toolTipTextPrefix");
        }
        
        catch (java.util.MissingResourceException excMissingResource)
        {
            excMissingResource.printStackTrace();
            MySystem.s_printOutExit(strWhere, "excMissingResource caught");
        }
        
        strBundleFileShort = null;
        strWhere = null;
    }
    
    // ------
    // PUBLIC
    
     public void destroy()
    {
        super.destroy();
        
        if (this._dlg != null)
        {
            if (this._dlg.isVisible())
                this._dlg.setVisible(false);
            
            this._dlg.destroy();
            this._dlg = null;
        }
    }
    
    // ---------
    // PROTECTED
        
    protected BESAboutAppliAbs(
            String strImage,
            
            final Component cmpFrameOwner,
            final String strTitleApplication,
            final String strDlgBodyVersion,
            final String strProductID,
            final String strDlgBodyTextThirdParty,
            final PTabHelpAppliAdvancedAbs pnlTabAdvanced // created in subclasses
            )
    {
        super(com.google.code.p.keytooliui.shared.swing.imageicon.S_IINShared.s_get(strImage));
        
        String strMethod = "BESAboutAppliAbs(..)";

        if (_s_strToolTipTextPrefix != null)
            setToolTipText(_s_strToolTipTextPrefix + " " + strTitleApplication);
        
        if (strProductID == null)
            MySystem.s_printOutExit(this, strMethod, "nil strProductID");
            
        this.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent actionEvent)
            {
                String strMethod = "BESAboutAppliAbs(...).addActionListener(...).actionPerformed(...)";
                
                com.google.code.p.keytooliui.shared.awt.MyToolkit.s_beep();

                String strDlgBodyCopyright = MIHelpAboutAppliAbstract.s_strDlgBodyCopyright;
                
                if (_dlg == null)
                {
                    _dlg = new DHelpAboutAppli(
                        cmpFrameOwner,
                        strTitleApplication, 
                        MIHelpAboutAppliAbstract.s_strTitlePrefix,
                        strDlgBodyVersion,
                        strDlgBodyCopyright,
                        strProductID,
                        strDlgBodyTextThirdParty,
                        pnlTabAdvanced
                        );
                
                    if (! _dlg.init())
                        MySystem.s_printOutExit(this, strMethod, "failed");
                }
                
          
                _dlg.setVisible(true);
            }
        });
        
    }
    
    // -------
    // PRIVATE
    
    private DHelpAboutAppli _dlg = null;
}

