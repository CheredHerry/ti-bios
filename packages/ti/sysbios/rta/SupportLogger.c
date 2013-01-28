/* 
 * Copyright (c) 2012, Texas Instruments Incorporated
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * *  Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * *  Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * *  Neither the name of Texas Instruments Incorporated nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * */
/*
 *  ======== SupportLogger.c ========
 */

#include <xdc/std.h>

#include <xdc/runtime/Log.h>
#include <xdc/runtime/LoggerBuf.h>
#include <xdc/runtime/Startup.h>
#include <xdc/runtime/Types.h>
#include <xdc/runtime/Timestamp.h>

#include "package/internal/SupportLogger.xdc.h"

/*
 *  ======== SupportLogger_Module_startup =========
 */
Int SupportLogger_Module_startup(Int phase)
{
    Types_FreqHz freq;
    
    if (LoggerBuf_Module_startupDone()) {
        /* Get the Timestamp frequency. */
        Timestamp_getFreq(&freq);
    
        Log_write2(SupportLogger_LM_timestampFreq, (UArg) freq.hi, (UArg) freq.lo);
            
        return (Startup_DONE);
    }
    else {
        return(Startup_NOTDONE);
    }
    
}

/*
 */
/*
 *  @(#) ti.sysbios.rta; 2, 0, 0, 0,383; 11-7-2012 12:42:35; /db/vtree/library/trees/avala/avala-r22x/src/ xlibrary

 */
