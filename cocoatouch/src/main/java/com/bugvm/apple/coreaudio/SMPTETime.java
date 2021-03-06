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
package com.bugvm.apple.coreaudio;

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
import com.bugvm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SMPTETime/*</name>*/ 
    extends /*<extends>*/Struct<SMPTETime>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SMPTETimePtr extends Ptr<SMPTETime, SMPTETimePtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SMPTETime() {}
    public SMPTETime(short subframes, short subframeDivisor, int counter, SMPTETimeType type, SMPTEStateFlags flags, short hours, short minutes, short seconds, short frames) {
        this.setSubframes(subframes);
        this.setSubframeDivisor(subframeDivisor);
        this.setCounter(counter);
        this.setType(type);
        this.setFlags(flags);
        this.setHours(hours);
        this.setMinutes(minutes);
        this.setSeconds(seconds);
        this.setFrames(frames);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native short getSubframes();
    @StructMember(0) public native SMPTETime setSubframes(short subframes);
    @StructMember(1) public native short getSubframeDivisor();
    @StructMember(1) public native SMPTETime setSubframeDivisor(short subframeDivisor);
    @StructMember(2) public native int getCounter();
    @StructMember(2) public native SMPTETime setCounter(int counter);
    @StructMember(3) public native SMPTETimeType getType();
    @StructMember(3) public native SMPTETime setType(SMPTETimeType type);
    @StructMember(4) public native SMPTEStateFlags getFlags();
    @StructMember(4) public native SMPTETime setFlags(SMPTEStateFlags flags);
    @StructMember(5) public native short getHours();
    @StructMember(5) public native SMPTETime setHours(short hours);
    @StructMember(6) public native short getMinutes();
    @StructMember(6) public native SMPTETime setMinutes(short minutes);
    @StructMember(7) public native short getSeconds();
    @StructMember(7) public native SMPTETime setSeconds(short seconds);
    @StructMember(8) public native short getFrames();
    @StructMember(8) public native SMPTETime setFrames(short frames);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
