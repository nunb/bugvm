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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UISplitViewControllerDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "splitViewController:willChangeToDisplayMode:")
    void willChangeToDisplayMode(UISplitViewController svc, UISplitViewControllerDisplayMode displayMode);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "targetDisplayModeForActionInSplitViewController:")
    UISplitViewControllerDisplayMode getTargetDisplayMode(UISplitViewController svc);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "splitViewController:showViewController:sender:")
    boolean showViewController(UISplitViewController splitViewController, UIViewController vc, NSObject sender);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "splitViewController:showDetailViewController:sender:")
    boolean showDetailViewController(UISplitViewController splitViewController, UIViewController vc, NSObject sender);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "primaryViewControllerForCollapsingSplitViewController:")
    UIViewController getPrimaryViewControllerForCollapsing(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "primaryViewControllerForExpandingSplitViewController:")
    UIViewController getPrimaryViewControllerForExpanding(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "splitViewController:collapseSecondaryViewController:ontoPrimaryViewController:")
    boolean collapseSecondaryViewController(UISplitViewController splitViewController, UIViewController secondaryViewController, UIViewController primaryViewController);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "splitViewController:separateSecondaryViewControllerFromPrimaryViewController:")
    UIViewController separateSecondaryViewController(UISplitViewController splitViewController, UIViewController primaryViewController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "splitViewControllerSupportedInterfaceOrientations:")
    UIInterfaceOrientationMask getSupportedInterfaceOrientations(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "splitViewControllerPreferredInterfaceOrientationForPresentation:")
    UIInterfaceOrientation getPreferredInterfaceOrientation(UISplitViewController splitViewController);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    void willHideViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem, UIPopoverController pc);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "splitViewController:willShowViewController:invalidatingBarButtonItem:")
    void willShowViewController(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "splitViewController:popoverController:willPresentViewController:")
    void willPresentViewController(UISplitViewController svc, UIPopoverController pc, UIViewController aViewController);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Method(selector = "splitViewController:shouldHideViewController:inOrientation:")
    boolean shouldHideViewController(UISplitViewController svc, UIViewController vc, UIInterfaceOrientation orientation);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
