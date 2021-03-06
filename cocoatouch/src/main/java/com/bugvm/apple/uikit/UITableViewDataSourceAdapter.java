/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITableViewDataSourceAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UITableViewDataSource/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("tableView:numberOfRowsInSection:")
    public @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section) { return 0; }
    @NotImplemented("tableView:cellForRowAtIndexPath:")
    public UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath) { return null; }
    @NotImplemented("numberOfSectionsInTableView:")
    public @MachineSizedSInt long getNumberOfSections(UITableView tableView) { return 0; }
    @NotImplemented("tableView:titleForHeaderInSection:")
    public String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:titleForFooterInSection:")
    public String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section) { return null; }
    @NotImplemented("tableView:canEditRowAtIndexPath:")
    public boolean canEditRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    @NotImplemented("tableView:canMoveRowAtIndexPath:")
    public boolean canMoveRow(UITableView tableView, NSIndexPath indexPath) { return false; }
    @NotImplemented("sectionIndexTitlesForTableView:")
    public @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSectionIndexTitles(UITableView tableView) { return null; }
    @NotImplemented("tableView:sectionForSectionIndexTitle:atIndex:")
    public @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index) { return 0; }
    @NotImplemented("tableView:commitEditingStyle:forRowAtIndexPath:")
    public void commitEditingStyleForRow(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath) {}
    @NotImplemented("tableView:moveRowAtIndexPath:toIndexPath:")
    public void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath) {}
    /*</methods>*/
}
