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
package com.bugvm.bindings.AudioUnit;

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
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/AURenderActionFlags/*</name>*/ extends Bits</*<name>*/AURenderActionFlags/*</name>*/> {
    /*<values>*/
    public static final AURenderActionFlags None = new AURenderActionFlags(0L);
    public static final AURenderActionFlags PreRender = new AURenderActionFlags(4L);
    public static final AURenderActionFlags PostRender = new AURenderActionFlags(8L);
    public static final AURenderActionFlags OutputIsSilence = new AURenderActionFlags(16L);
    public static final AURenderActionFlags OfflinePreflight = new AURenderActionFlags(32L);
    public static final AURenderActionFlags OfflineRender = new AURenderActionFlags(64L);
    public static final AURenderActionFlags OfflineComplete = new AURenderActionFlags(128L);
    public static final AURenderActionFlags PostRenderError = new AURenderActionFlags(256L);
    public static final AURenderActionFlags DoNotCheckRenderArgs = new AURenderActionFlags(512L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AURenderActionFlags/*</name>*/[] values = _values(/*<name>*/AURenderActionFlags/*</name>*/.class);

    public /*<name>*/AURenderActionFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/AURenderActionFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AURenderActionFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AURenderActionFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/AURenderActionFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AURenderActionFlags/*</name>*/[] values() {
        return values.clone();
    }
}
