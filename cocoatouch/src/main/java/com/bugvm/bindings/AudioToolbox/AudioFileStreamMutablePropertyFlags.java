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
package com.bugvm.bindings.AudioToolbox;

import com.bugvm.rt.bro.Struct;
import com.bugvm.rt.bro.annotation.StructMember;


public class AudioFileStreamMutablePropertyFlags extends Struct<AudioFileStreamMutablePropertyFlags> {

    public AudioFileStreamPropertyFlags get() {
        return new AudioFileStreamPropertyFlags(getValue());
    }
    
    public void set(AudioFileStreamPropertyFlags flags) {
        setValue((int)flags.value());
    }
    
    @StructMember(0)
    private native int getValue();
    
    @StructMember(0)
    private native void setValue(int value);
    
}
