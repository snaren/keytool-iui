/*
 *
 * Copyright (c) 2001-2002 RagingCat Project.
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
 
 
 package com.google.code.p.keytooliui.shared.swing.editorpane;

/**
    known subclasses:
    . EPTextRTFSys
    . EPTextRTFJar
    

    MEMO: for now: the 2 subclasses are identical!!!!!!!!!!!!
**/




import com.google.code.p.keytooliui.shared.util.eventlistener.*;

import javax.swing.text.rtf.*;

import java.awt.*; 
import java.net.*; 


/** 
 * Allows printing of mousePressed documents displayed in JEditorPanes 
 */ 
abstract public class EPTextRTFAbs extends EPTextAbs
{         
    // ---------
    // PROTECTED

    protected EPTextRTFAbs(
        EPTextAbsListener pepListenerParent,
        Component cmpFrameOwner,
        String strTitleApplication, 
        Color colPageTextSelection,
        URL url
        )
        
        //throws IOException
    {
        super(pepListenerParent, cmpFrameOwner, strTitleApplication, colPageTextSelection, url,
            new RTFEditorKit());  
    }
} 
