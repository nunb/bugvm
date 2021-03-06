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
package com.bugvm.apple.foundation;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.security.*;
import com.bugvm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSCompoundPredicate/*</name>*/ 
    extends /*<extends>*/NSPredicate/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSCompoundPredicatePtr extends Ptr<NSCompoundPredicate, NSCompoundPredicatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSCompoundPredicate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSCompoundPredicate() {}
    protected NSCompoundPredicate(SkipInit skipInit) { super(skipInit); }
    public NSCompoundPredicate(NSCompoundPredicateType type, NSArray<NSPredicate> subpredicates) { super((SkipInit) null); initObject(init(type, subpredicates)); }
    public NSCompoundPredicate(NSCoder coder) { super((SkipInit) null); initObject(initWithCoder$(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "compoundPredicateType")
    public native NSCompoundPredicateType getCompoundPredicateType();
    @Property(selector = "subpredicates")
    public native NSArray<NSPredicate> getSubpredicates();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithType:subpredicates:")
    protected native @Pointer long init(NSCompoundPredicateType type, NSArray<NSPredicate> subpredicates);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long initWithCoder$(NSCoder coder);
    @Method(selector = "andPredicateWithSubpredicates:")
    public static native NSCompoundPredicate createAndPredicate(NSArray<NSPredicate> subpredicates);
    @Method(selector = "orPredicateWithSubpredicates:")
    public static native NSCompoundPredicate createOrPredicate(NSArray<NSPredicate> subpredicates);
    @Method(selector = "notPredicateWithSubpredicate:")
    public static native NSCompoundPredicate createNotPredicate(NSPredicate predicate);
    /*</methods>*/
}
