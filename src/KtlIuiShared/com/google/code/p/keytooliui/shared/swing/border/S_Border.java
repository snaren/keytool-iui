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
 
 
 package com.google.code.p.keytooliui.shared.swing.border;

import com.google.code.p.keytooliui.shared.lang.*;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;


public class S_Border
{
    // --------------------
    // FINAL STATIC PRIVATE
    
    final static private String _f_s_strClass = "com.google.code.p.keytooliui.shared.swing.border.S_Border.";
    
    final static private Border _f_s_brdEmpty5 = new EmptyBorder(5,5,5,5);
    final static private Border _f_s_brdEmpty0 = new EmptyBorder(0, 0, 0, 0);
    final static private Border _f_s_brdEmpty2 = new EmptyBorder(2, 2, 2, 2);
    final static private Border _f_s_brdEtched = new EtchedBorder();
    
    final static private Border _f_s_brdLightLowered = new BevelBorder(BevelBorder.LOWERED, 
        Color.white, Color.gray);
    
    final static private Font _f_s_fntTitle = new Font("Dialog", Font.BOLD, 12);
    
    // -------------
    // STATIC PUBLIC
    
    
    static public void s_set(JPanel pnl, String strTitle)
    {
        String f_strMethod = _f_s_strClass + "s_set(pnl, strTitle)";
        
        if (pnl==null || strTitle==null)
            MySystem.s_printOutExit(f_strMethod, "nil arg");
        
        Border brdTitle = new TitledBorder(null, strTitle, 
	        TitledBorder.LEFT, TitledBorder.TOP, _f_s_fntTitle, new Color(80, 40, 40));

	    Border brdCompound = new CompoundBorder(brdTitle, _f_s_brdEmpty5);
	    pnl.setBorder(brdCompound);
    }
    
    // 
    
    static public void s_setRaised(JPanel pnl)
    {
        String strMethod = _f_s_strClass + "s_setRaised(pnl)";
        
        if (pnl == null)
            MySystem.s_printOutExit(strMethod, "nil arg");
        
        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        
	    //Border brdCompound = new CompoundBorder(_f_s_brdEtched, _f_s_brdEmpty5);
	    pnl.setBorder(raisedbevel);
    }
    
    static public void s_setEtched(JPanel pnl)
    {
        String strMethod = _f_s_strClass + "s_setEtched(pnl)";
        
        if (pnl == null)
            MySystem.s_printOutExit(strMethod, "nil arg");
        
	    Border brdCompound = new CompoundBorder(_f_s_brdEtched, _f_s_brdEmpty5);
	    pnl.setBorder(brdCompound);
    }
    
    static public void s_setEmpty(JPanel pnl)
    {
        String strMethod = _f_s_strClass + "s_setEmpty(pnl)";
        
        if (pnl == null)
            MySystem.s_printOutExit(strMethod, "nil arg");
        
        pnl.setBorder(_f_s_brdEmpty5);
    }
    
    static public void s_setEmptyLightLowered2(JPanel pnl)
    {
        String strMethod = _f_s_strClass + "s_setEmptyLightLowered2(pnl)";
        
        if (pnl == null)
            MySystem.s_printOutExit(strMethod, "nil arg");

        Border brdCompound = new CompoundBorder(_f_s_brdLightLowered, _f_s_brdEmpty2);
	    pnl.setBorder(brdCompound);
    }
    
    static public void s_setEmptyLightLowered0(JPanel pnl)
    {
        String strMethod = _f_s_strClass + "s_setEmptyLightLowered0(pnl)";
        
        if (pnl == null)
            MySystem.s_printOutExit(strMethod, "nil arg");

        Border brdCompound = new CompoundBorder(_f_s_brdLightLowered, _f_s_brdEmpty0);
	    pnl.setBorder(brdCompound);
    }
    
    static public void s_setEmptyLightLowered5(JPanel pnl)
    {
        String strMethod = _f_s_strClass + "s_setEmptyLightLowered5(pnl)";
        
        if (pnl == null)
            MySystem.s_printOutExit(strMethod, "nil arg");

        Border brdCompound = new CompoundBorder(_f_s_brdLightLowered, _f_s_brdEmpty5);
	    pnl.setBorder(brdCompound);
    }
    
}
