/*
 *  Do not modify this file; it is automatically 
 *  generated and any modifications will be overwritten.
 *
 * @(#) xdc-y35
 */
import java.util.*;
import org.mozilla.javascript.*;
import xdc.services.intern.xsr.*;
import xdc.services.spec.Session;

public class ti_sysbios_hal_vayu
{
    static final String VERS = "@(#) xdc-y35\n";

    static final Proto.Elm $$T_Bool = Proto.Elm.newBool();
    static final Proto.Elm $$T_Num = Proto.Elm.newNum();
    static final Proto.Elm $$T_Str = Proto.Elm.newStr();
    static final Proto.Elm $$T_Obj = Proto.Elm.newObj();

    static final Proto.Fxn $$T_Met = new Proto.Fxn(null, null, 0, -1, false);
    static final Proto.Map $$T_Map = new Proto.Map($$T_Obj);
    static final Proto.Arr $$T_Vec = new Proto.Arr($$T_Obj);

    static final XScriptO $$DEFAULT = Value.DEFAULT;
    static final Object $$UNDEF = Undefined.instance;

    static final Proto.Obj $$Package = (Proto.Obj)Global.get("$$Package");
    static final Proto.Obj $$Module = (Proto.Obj)Global.get("$$Module");
    static final Proto.Obj $$Instance = (Proto.Obj)Global.get("$$Instance");
    static final Proto.Obj $$Params = (Proto.Obj)Global.get("$$Params");

    static final Object $$objFldGet = Global.get("$$objFldGet");
    static final Object $$objFldSet = Global.get("$$objFldSet");
    static final Object $$proxyGet = Global.get("$$proxyGet");
    static final Object $$proxySet = Global.get("$$proxySet");
    static final Object $$delegGet = Global.get("$$delegGet");
    static final Object $$delegSet = Global.get("$$delegSet");

    Scriptable xdcO;
    Session ses;
    Value.Obj om;

    boolean isROV;
    boolean isCFG;

    Proto.Obj pkgP;
    Value.Obj pkgV;

    ArrayList<Object> imports = new ArrayList<Object>();
    ArrayList<Object> loggables = new ArrayList<Object>();
    ArrayList<Object> mcfgs = new ArrayList<Object>();
    ArrayList<Object> icfgs = new ArrayList<Object>();
    ArrayList<String> inherits = new ArrayList<String>();
    ArrayList<Object> proxies = new ArrayList<Object>();
    ArrayList<Object> sizes = new ArrayList<Object>();
    ArrayList<Object> tdefs = new ArrayList<Object>();

    void $$IMPORTS()
    {
        Global.callFxn("loadPackage", xdcO, "xdc");
        Global.callFxn("loadPackage", xdcO, "xdc.corevers");
        Global.callFxn("loadPackage", xdcO, "xdc.runtime");
        Global.callFxn("loadPackage", xdcO, "ti.sysbios.interfaces");
        Global.callFxn("loadPackage", xdcO, "xdc.rov");
    }

    void $$OBJECTS()
    {
        pkgP = (Proto.Obj)om.bind("ti.sysbios.hal.vayu.Package", new Proto.Obj());
        pkgV = (Value.Obj)om.bind("ti.sysbios.hal.vayu", new Value.Obj("ti.sysbios.hal.vayu", pkgP));
    }

    void IntXbar$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.sysbios.hal.vayu.IntXbar.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.sysbios.hal.vayu.IntXbar", new Value.Obj("ti.sysbios.hal.vayu.IntXbar", po));
        pkgV.bind("IntXbar", vo);
        // decls 
        spo = (Proto.Obj)om.bind("ti.sysbios.hal.vayu.IntXbar$$ModuleDataView", new Proto.Obj());
        om.bind("ti.sysbios.hal.vayu.IntXbar.ModuleDataView", new Proto.Str(spo, false));
        spo = (Proto.Obj)om.bind("ti.sysbios.hal.vayu.IntXbar$$Module_State", new Proto.Obj());
        om.bind("ti.sysbios.hal.vayu.IntXbar.Module_State", new Proto.Str(spo, false));
    }

    void TimerSupport$$OBJECTS()
    {
        Proto.Obj po, spo;
        Value.Obj vo;

        po = (Proto.Obj)om.bind("ti.sysbios.hal.vayu.TimerSupport.Module", new Proto.Obj());
        vo = (Value.Obj)om.bind("ti.sysbios.hal.vayu.TimerSupport", new Value.Obj("ti.sysbios.hal.vayu.TimerSupport", po));
        pkgV.bind("TimerSupport", vo);
        // decls 
        spo = (Proto.Obj)om.bind("ti.sysbios.hal.vayu.TimerSupport$$ModuleView", new Proto.Obj());
        om.bind("ti.sysbios.hal.vayu.TimerSupport.ModuleView", new Proto.Str(spo, false));
    }

    void IntXbar$$CONSTS()
    {
        // module IntXbar
        om.bind("ti.sysbios.hal.vayu.IntXbar.NUM_EVE_XBAR_INST", 8L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.NUM_DSP_XBAR_INST", 64L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.NUM_BENELLI_XBAR_INST", 57L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.NUM_A15_XBAR_INST", 152L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_BASE_ADDR", 0x4A002000L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_EVE0", 0x7A0L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_EVE1", 0x7B0L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_EVE2", 0x7C0L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_EVE3", 0x7D0L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_DSP0", 0x948L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_DSP1", 0x9c8L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_BENELLI_CORE0", 0x7E0L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_BENELLI_CORE1", 0x854L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.MMR_OFFSET_A15", 0xA48L);
        om.bind("ti.sysbios.hal.vayu.IntXbar.connect", new Extern("ti_sysbios_hal_vayu_IntXbar_connect__E", "xdc_Void(*)(xdc_UInt,xdc_UInt)", true, false));
        om.bind("ti.sysbios.hal.vayu.IntXbar.disconnect", new Extern("ti_sysbios_hal_vayu_IntXbar_disconnect__E", "xdc_Void(*)(xdc_UInt)", true, false));
        om.bind("ti.sysbios.hal.vayu.IntXbar.initIntXbar", new Extern("ti_sysbios_hal_vayu_IntXbar_initIntXbar__I", "xdc_Void(*)(xdc_Void)", true, false));
    }

    void TimerSupport$$CONSTS()
    {
        // module TimerSupport
        om.bind("ti.sysbios.hal.vayu.TimerSupport.enable", new Extern("ti_sysbios_hal_vayu_TimerSupport_enable__E", "xdc_Void(*)(xdc_UInt,xdc_runtime_Error_Block*)", true, false));
    }

    void IntXbar$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void TimerSupport$$CREATES()
    {
        Proto.Fxn fxn;
        StringBuilder sb;

    }

    void IntXbar$$FUNCTIONS()
    {
        Proto.Fxn fxn;

        // fxn IntXbar.connectMeta
        fxn = (Proto.Fxn)om.bind("ti.sysbios.hal.vayu.IntXbar$$connectMeta", new Proto.Fxn(om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module", "ti.sysbios.hal.vayu"), null, 2, 2, false));
                fxn.addArg(0, "xbarInstance", Proto.Elm.newCNum("(xdc_UInt)"), $$UNDEF);
                fxn.addArg(1, "intSource", Proto.Elm.newCNum("(xdc_UInt)"), $$UNDEF);
        // fxn IntXbar.disconnectMeta
        fxn = (Proto.Fxn)om.bind("ti.sysbios.hal.vayu.IntXbar$$disconnectMeta", new Proto.Fxn(om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module", "ti.sysbios.hal.vayu"), null, 1, 1, false));
                fxn.addArg(0, "xbarInstance", Proto.Elm.newCNum("(xdc_UInt)"), $$UNDEF);
    }

    void TimerSupport$$FUNCTIONS()
    {
        Proto.Fxn fxn;

    }

    void IntXbar$$SIZES()
    {
        Proto.Str so;
        Object fxn;

        so = (Proto.Str)om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module_State", "ti.sysbios.hal.vayu");
        sizes.clear();
        sizes.add(Global.newArray("intXbar", "UPtr"));
        so.bind("$$sizes", Global.newArray(sizes.toArray()));
        fxn = Global.eval("function() { return $$sizeof(xdc.om['ti.sysbios.hal.vayu.IntXbar.Module_State']); }");
        so.bind("$sizeof", fxn);
        fxn = Global.eval("function() { return $$alignof(xdc.om['ti.sysbios.hal.vayu.IntXbar.Module_State']); }");
        so.bind("$alignof", fxn);
        fxn = Global.eval("function(fld) { return $$offsetof(xdc.om['ti.sysbios.hal.vayu.IntXbar.Module_State'], fld); }");
        so.bind("$offsetof", fxn);
    }

    void TimerSupport$$SIZES()
    {
        Proto.Str so;
        Object fxn;

    }

    void IntXbar$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/sysbios/hal/vayu/IntXbar.xs");
        om.bind("ti.sysbios.hal.vayu.IntXbar$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module", "ti.sysbios.hal.vayu");
        po.init("ti.sysbios.hal.vayu.IntXbar.Module", om.findStrict("xdc.runtime.IModule.Module", "ti.sysbios.hal.vayu"));
                po.addFld("$hostonly", $$T_Num, 0, "r");
                po.addFld("NUM_EVE_XBAR_INST", Proto.Elm.newCNum("(xdc_UInt16)"), 8L, "rh");
                po.addFld("NUM_DSP_XBAR_INST", Proto.Elm.newCNum("(xdc_UInt16)"), 64L, "rh");
                po.addFld("NUM_BENELLI_XBAR_INST", Proto.Elm.newCNum("(xdc_UInt16)"), 57L, "rh");
                po.addFld("NUM_A15_XBAR_INST", Proto.Elm.newCNum("(xdc_UInt16)"), 152L, "rh");
                po.addFld("MMR_BASE_ADDR", Proto.Elm.newCNum("(xdc_UInt32)"), 0x4A002000L, "rh");
                po.addFld("MMR_OFFSET_EVE0", Proto.Elm.newCNum("(xdc_UInt32)"), 0x7A0L, "rh");
                po.addFld("MMR_OFFSET_EVE1", Proto.Elm.newCNum("(xdc_UInt32)"), 0x7B0L, "rh");
                po.addFld("MMR_OFFSET_EVE2", Proto.Elm.newCNum("(xdc_UInt32)"), 0x7C0L, "rh");
                po.addFld("MMR_OFFSET_EVE3", Proto.Elm.newCNum("(xdc_UInt32)"), 0x7D0L, "rh");
                po.addFld("MMR_OFFSET_DSP0", Proto.Elm.newCNum("(xdc_UInt32)"), 0x948L, "rh");
                po.addFld("MMR_OFFSET_DSP1", Proto.Elm.newCNum("(xdc_UInt32)"), 0x9c8L, "rh");
                po.addFld("MMR_OFFSET_BENELLI_CORE0", Proto.Elm.newCNum("(xdc_UInt32)"), 0x7E0L, "rh");
                po.addFld("MMR_OFFSET_BENELLI_CORE1", Proto.Elm.newCNum("(xdc_UInt32)"), 0x854L, "rh");
                po.addFld("MMR_OFFSET_A15", Proto.Elm.newCNum("(xdc_UInt32)"), 0xA48L, "rh");
        if (isCFG) {
            po.addFld("rovViewInfo", (Proto)om.findStrict("xdc.rov.ViewInfo.Instance", "ti.sysbios.hal.vayu"), $$UNDEF, "wh");
            po.addFld("A_badEveXbarInstanceNum", (Proto)om.findStrict("xdc.runtime.Assert$$Id", "ti.sysbios.hal.vayu"), Global.newObject("msg", "A_badEveXbarInstanceNum: xbarInstance must be >= 1 and <= 8"), "w");
            po.addFld("A_badDspXbarInstanceNum", (Proto)om.findStrict("xdc.runtime.Assert$$Id", "ti.sysbios.hal.vayu"), Global.newObject("msg", "A_badDspXbarInstanceNum: xbarInstance must be >= 1 and <= 64"), "w");
            po.addFld("A_badBenelliXbarInstanceNum", (Proto)om.findStrict("xdc.runtime.Assert$$Id", "ti.sysbios.hal.vayu"), Global.newObject("msg", "A_badBenelliXbarInstanceNum: xbarInstance must be >= 1 and <= 57"), "w");
            po.addFld("A_badA15XbarInstanceNum", (Proto)om.findStrict("xdc.runtime.Assert$$Id", "ti.sysbios.hal.vayu"), Global.newObject("msg", "A_badA15XbarInstanceNum: xbarInstance must be >= 1 and <= 152"), "w");
            po.addFld("A_badIntSourceIdx", (Proto)om.findStrict("xdc.runtime.Assert$$Id", "ti.sysbios.hal.vayu"), Global.newObject("msg", "A_badIntSourceIdx: intSource must be <= 391"), "w");
            po.addFld("intXbar", new Proto.Arr(Proto.Elm.newCNum("(xdc_UInt16)"), false), $$DEFAULT, "w");
        }//isCFG
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.IntXbar$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.IntXbar$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$static$init");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.IntXbar$$module$static$init", true);
        if (fxn != null) po.addFxn("module$static$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.IntXbar$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
                po.addFxn("connectMeta", (Proto.Fxn)om.findStrict("ti.sysbios.hal.vayu.IntXbar$$connectMeta", "ti.sysbios.hal.vayu"), Global.get(cap, "connectMeta"));
                po.addFxn("disconnectMeta", (Proto.Fxn)om.findStrict("ti.sysbios.hal.vayu.IntXbar$$disconnectMeta", "ti.sysbios.hal.vayu"), Global.get(cap, "disconnectMeta"));
        // struct IntXbar.ModuleDataView
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar$$ModuleDataView", "ti.sysbios.hal.vayu");
        po.init("ti.sysbios.hal.vayu.IntXbar.ModuleDataView", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("xbarInstanceNumber", Proto.Elm.newCNum("(xdc_Int)"), $$UNDEF, "w");
                po.addFld("coreInterruptNumber", Proto.Elm.newCNum("(xdc_Int)"), $$UNDEF, "w");
                po.addFld("interruptSourceIndex", Proto.Elm.newCNum("(xdc_Int)"), $$UNDEF, "w");
        // struct IntXbar.Module_State
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar$$Module_State", "ti.sysbios.hal.vayu");
        po.init("ti.sysbios.hal.vayu.IntXbar.Module_State", null);
                po.addFld("$hostonly", $$T_Num, 0, "r");
                po.addFld("intXbar", new Proto.Arr(Proto.Elm.newCNum("(xdc_UInt16)"), false), $$DEFAULT, "w");
    }

    void TimerSupport$$TYPES()
    {
        Scriptable cap;
        Proto.Obj po;
        Proto.Str ps;
        Proto.Typedef pt;
        Object fxn;

        cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/sysbios/hal/vayu/TimerSupport.xs");
        om.bind("ti.sysbios.hal.vayu.TimerSupport$$capsule", cap);
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.TimerSupport.Module", "ti.sysbios.hal.vayu");
        po.init("ti.sysbios.hal.vayu.TimerSupport.Module", om.findStrict("ti.sysbios.interfaces.ITimerSupport.Module", "ti.sysbios.hal.vayu"));
                po.addFld("$hostonly", $$T_Num, 0, "r");
        if (isCFG) {
            po.addFld("rovViewInfo", (Proto)om.findStrict("xdc.rov.ViewInfo.Instance", "ti.sysbios.hal.vayu"), $$UNDEF, "wh");
            po.addFld("a15TimerAvailMask", Proto.Elm.newCNum("(xdc_Bits32)"), 0x00FFL, "w");
            po.addFld("dsp0TimerAvailMask", Proto.Elm.newCNum("(xdc_Bits32)"), 0x0F00L, "w");
            po.addFld("dsp1TimerAvailMask", Proto.Elm.newCNum("(xdc_Bits32)"), 0xF000L, "w");
            po.addFld("needDsp0XbarInit", $$T_Bool, true, "w");
            po.addFld("needDsp1XbarInit", $$T_Bool, true, "w");
        }//isCFG
        fxn = Global.get(cap, "module$use");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.TimerSupport$$module$use", true);
        if (fxn != null) po.addFxn("module$use", $$T_Met, fxn);
        fxn = Global.get(cap, "module$meta$init");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.TimerSupport$$module$meta$init", true);
        if (fxn != null) po.addFxn("module$meta$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$static$init");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.TimerSupport$$module$static$init", true);
        if (fxn != null) po.addFxn("module$static$init", $$T_Met, fxn);
        fxn = Global.get(cap, "module$validate");
        if (fxn != null) om.bind("ti.sysbios.hal.vayu.TimerSupport$$module$validate", true);
        if (fxn != null) po.addFxn("module$validate", $$T_Met, fxn);
        // struct TimerSupport.ModuleView
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.TimerSupport$$ModuleView", "ti.sysbios.hal.vayu");
        po.init("ti.sysbios.hal.vayu.TimerSupport.ModuleView", null);
                po.addFld("$hostonly", $$T_Num, 1, "r");
                po.addFld("a15TimerAvailMask", $$T_Str, $$UNDEF, "w");
                po.addFld("dsp0TimerAvailMask", $$T_Str, $$UNDEF, "w");
                po.addFld("dsp1TimerAvailMask", $$T_Str, $$UNDEF, "w");
    }

    void IntXbar$$ROV()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar", "ti.sysbios.hal.vayu");
        vo.bind("Module_State$fetchDesc", Global.newObject("type", "ti.sysbios.hal.vayu.IntXbar.Module_State", "isScalar", false));
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar$$Module_State", "ti.sysbios.hal.vayu");
        po.bind("intXbar$fetchDesc", Global.newObject("type", "xdc.rov.support.ScalarStructs.S_UInt16", "isScalar", true));
    }

    void TimerSupport$$ROV()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.sysbios.hal.vayu.TimerSupport", "ti.sysbios.hal.vayu");
    }

    void $$SINGLETONS()
    {
        pkgP.init("ti.sysbios.hal.vayu.Package", (Proto.Obj)om.findStrict("xdc.IPackage.Module", "ti.sysbios.hal.vayu"));
        Scriptable cap = (Scriptable)Global.callFxn("loadCapsule", xdcO, "ti/sysbios/hal/vayu/package.xs");
        om.bind("xdc.IPackage$$capsule", cap);
        Object fxn;
                fxn = Global.get(cap, "init");
                if (fxn != null) pkgP.addFxn("init", (Proto.Fxn)om.findStrict("xdc.IPackage$$init", "ti.sysbios.hal.vayu"), fxn);
                fxn = Global.get(cap, "close");
                if (fxn != null) pkgP.addFxn("close", (Proto.Fxn)om.findStrict("xdc.IPackage$$close", "ti.sysbios.hal.vayu"), fxn);
                fxn = Global.get(cap, "validate");
                if (fxn != null) pkgP.addFxn("validate", (Proto.Fxn)om.findStrict("xdc.IPackage$$validate", "ti.sysbios.hal.vayu"), fxn);
                fxn = Global.get(cap, "exit");
                if (fxn != null) pkgP.addFxn("exit", (Proto.Fxn)om.findStrict("xdc.IPackage$$exit", "ti.sysbios.hal.vayu"), fxn);
                fxn = Global.get(cap, "getLibs");
                if (fxn != null) pkgP.addFxn("getLibs", (Proto.Fxn)om.findStrict("xdc.IPackage$$getLibs", "ti.sysbios.hal.vayu"), fxn);
                fxn = Global.get(cap, "getSects");
                if (fxn != null) pkgP.addFxn("getSects", (Proto.Fxn)om.findStrict("xdc.IPackage$$getSects", "ti.sysbios.hal.vayu"), fxn);
        pkgP.bind("$capsule", cap);
        pkgV.init2(pkgP, "ti.sysbios.hal.vayu", Value.DEFAULT, false);
        pkgV.bind("$name", "ti.sysbios.hal.vayu");
        pkgV.bind("$category", "Package");
        pkgV.bind("$$qn", "ti.sysbios.hal.vayu.");
        pkgV.bind("$vers", Global.newArray("2, 0, 0, 0"));
        Value.Map atmap = (Value.Map)pkgV.getv("$attr");
        atmap.seal("length");
        imports.clear();
        pkgV.bind("$imports", imports);
        StringBuilder sb = new StringBuilder();
        sb.append("var pkg = xdc.om['ti.sysbios.hal.vayu'];\n");
        sb.append("if (pkg.$vers.length >= 3) {\n");
            sb.append("pkg.$vers.push(Packages.xdc.services.global.Vers.getDate(xdc.csd() + '/..'));\n");
        sb.append("}\n");
        sb.append("pkg.build.libraries = [\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.aem3',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.aem4',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.aem4f',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.am3g',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.am4g',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.am4fg',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.aa15g',\n");
            sb.append("'lib/smpbios/debug/ti.sysbios.hal.vayu.aem3',\n");
            sb.append("'lib/smpbios/debug/ti.sysbios.hal.vayu.aem4',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.ae66',\n");
            sb.append("'lib/sysbios/debug/ti.sysbios.hal.vayu.ae66e',\n");
        sb.append("];\n");
        sb.append("pkg.build.libDesc = [\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.aem3', {target: 'ti.targets.arm.elf.M3', suffix: 'em3'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.aem4', {target: 'ti.targets.arm.elf.M4', suffix: 'em4'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.aem4f', {target: 'ti.targets.arm.elf.M4F', suffix: 'em4f'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.am3g', {target: 'gnu.targets.arm.M3', suffix: 'm3g'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.am4g', {target: 'gnu.targets.arm.M4', suffix: 'm4g'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.am4fg', {target: 'gnu.targets.arm.M4F', suffix: 'm4fg'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.aa15g', {target: 'gnu.targets.arm.A15', suffix: 'a15g'}],\n");
            sb.append("['lib/smpbios/debug/ti.sysbios.hal.vayu.aem3', {target: 'ti.targets.arm.elf.M3', suffix: 'em3'}],\n");
            sb.append("['lib/smpbios/debug/ti.sysbios.hal.vayu.aem4', {target: 'ti.targets.arm.elf.M4', suffix: 'em4'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.ae66', {target: 'ti.targets.elf.C66', suffix: 'e66'}],\n");
            sb.append("['lib/sysbios/debug/ti.sysbios.hal.vayu.ae66e', {target: 'ti.targets.elf.C66_big_endian', suffix: 'e66e'}],\n");
        sb.append("];\n");
        Global.eval(sb.toString());
    }

    void IntXbar$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar", "ti.sysbios.hal.vayu");
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module", "ti.sysbios.hal.vayu");
        vo.init2(po, "ti.sysbios.hal.vayu.IntXbar", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.sysbios.hal.vayu.IntXbar$$capsule", "ti.sysbios.hal.vayu"));
        vo.bind("$package", om.findStrict("ti.sysbios.hal.vayu", "ti.sysbios.hal.vayu"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        mcfgs.add("Module__diagsEnabled");
        icfgs.add("Module__diagsEnabled");
        mcfgs.add("Module__diagsIncluded");
        icfgs.add("Module__diagsIncluded");
        mcfgs.add("Module__diagsMask");
        icfgs.add("Module__diagsMask");
        mcfgs.add("Module__gateObj");
        icfgs.add("Module__gateObj");
        mcfgs.add("Module__gatePrms");
        icfgs.add("Module__gatePrms");
        mcfgs.add("Module__id");
        icfgs.add("Module__id");
        mcfgs.add("Module__loggerDefined");
        icfgs.add("Module__loggerDefined");
        mcfgs.add("Module__loggerObj");
        icfgs.add("Module__loggerObj");
        mcfgs.add("Module__loggerFxn0");
        icfgs.add("Module__loggerFxn0");
        mcfgs.add("Module__loggerFxn1");
        icfgs.add("Module__loggerFxn1");
        mcfgs.add("Module__loggerFxn2");
        icfgs.add("Module__loggerFxn2");
        mcfgs.add("Module__loggerFxn4");
        icfgs.add("Module__loggerFxn4");
        mcfgs.add("Module__loggerFxn8");
        icfgs.add("Module__loggerFxn8");
        mcfgs.add("Module__startupDoneFxn");
        icfgs.add("Module__startupDoneFxn");
        mcfgs.add("Object__count");
        icfgs.add("Object__count");
        mcfgs.add("Object__heap");
        icfgs.add("Object__heap");
        mcfgs.add("Object__sizeof");
        icfgs.add("Object__sizeof");
        mcfgs.add("Object__table");
        icfgs.add("Object__table");
        vo.bind("ModuleDataView", om.findStrict("ti.sysbios.hal.vayu.IntXbar.ModuleDataView", "ti.sysbios.hal.vayu"));
        tdefs.add(om.findStrict("ti.sysbios.hal.vayu.IntXbar.ModuleDataView", "ti.sysbios.hal.vayu"));
        mcfgs.add("A_badEveXbarInstanceNum");
        mcfgs.add("A_badDspXbarInstanceNum");
        mcfgs.add("A_badBenelliXbarInstanceNum");
        mcfgs.add("A_badA15XbarInstanceNum");
        mcfgs.add("A_badIntSourceIdx");
        mcfgs.add("intXbar");
        icfgs.add("intXbar");
        vo.bind("Module_State", om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module_State", "ti.sysbios.hal.vayu"));
        tdefs.add(om.findStrict("ti.sysbios.hal.vayu.IntXbar.Module_State", "ti.sysbios.hal.vayu"));
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("xdc.runtime");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.sysbios.hal.vayu")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 0);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 0);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        if (isCFG) {
            Proto.Str ps = (Proto.Str)vo.find("Module_State");
            if (ps != null) vo.bind("$object", ps.newInstance());
            vo.bind("$$meta_iobj", 1);
        }//isCFG
        vo.bind("connect", om.findStrict("ti.sysbios.hal.vayu.IntXbar.connect", "ti.sysbios.hal.vayu"));
        vo.bind("disconnect", om.findStrict("ti.sysbios.hal.vayu.IntXbar.disconnect", "ti.sysbios.hal.vayu"));
        vo.bind("initIntXbar", om.findStrict("ti.sysbios.hal.vayu.IntXbar.initIntXbar", "ti.sysbios.hal.vayu"));
        vo.bind("$$fxntab", Global.newArray("ti_sysbios_hal_vayu_IntXbar_Module__startupDone__E", "ti_sysbios_hal_vayu_IntXbar_connect__E", "ti_sysbios_hal_vayu_IntXbar_disconnect__E"));
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray("A_badEveXbarInstanceNum", "A_badDspXbarInstanceNum", "A_badBenelliXbarInstanceNum", "A_badA15XbarInstanceNum", "A_badIntSourceIdx"));
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.seal("length");
        vo.bind("MODULE_STARTUP$", 0);
        vo.bind("PROXY$", 0);
        loggables.clear();
        vo.bind("$$loggables", loggables.toArray());
        pkgV.bind("IntXbar", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("IntXbar");
    }

    void TimerSupport$$SINGLETONS()
    {
        Proto.Obj po;
        Value.Obj vo;

        vo = (Value.Obj)om.findStrict("ti.sysbios.hal.vayu.TimerSupport", "ti.sysbios.hal.vayu");
        po = (Proto.Obj)om.findStrict("ti.sysbios.hal.vayu.TimerSupport.Module", "ti.sysbios.hal.vayu");
        vo.init2(po, "ti.sysbios.hal.vayu.TimerSupport", $$DEFAULT, false);
        vo.bind("Module", po);
        vo.bind("$category", "Module");
        vo.bind("$capsule", om.findStrict("ti.sysbios.hal.vayu.TimerSupport$$capsule", "ti.sysbios.hal.vayu"));
        vo.bind("$package", om.findStrict("ti.sysbios.hal.vayu", "ti.sysbios.hal.vayu"));
        tdefs.clear();
        proxies.clear();
        mcfgs.clear();
        icfgs.clear();
        inherits.clear();
        mcfgs.add("Module__diagsEnabled");
        icfgs.add("Module__diagsEnabled");
        mcfgs.add("Module__diagsIncluded");
        icfgs.add("Module__diagsIncluded");
        mcfgs.add("Module__diagsMask");
        icfgs.add("Module__diagsMask");
        mcfgs.add("Module__gateObj");
        icfgs.add("Module__gateObj");
        mcfgs.add("Module__gatePrms");
        icfgs.add("Module__gatePrms");
        mcfgs.add("Module__id");
        icfgs.add("Module__id");
        mcfgs.add("Module__loggerDefined");
        icfgs.add("Module__loggerDefined");
        mcfgs.add("Module__loggerObj");
        icfgs.add("Module__loggerObj");
        mcfgs.add("Module__loggerFxn0");
        icfgs.add("Module__loggerFxn0");
        mcfgs.add("Module__loggerFxn1");
        icfgs.add("Module__loggerFxn1");
        mcfgs.add("Module__loggerFxn2");
        icfgs.add("Module__loggerFxn2");
        mcfgs.add("Module__loggerFxn4");
        icfgs.add("Module__loggerFxn4");
        mcfgs.add("Module__loggerFxn8");
        icfgs.add("Module__loggerFxn8");
        mcfgs.add("Module__startupDoneFxn");
        icfgs.add("Module__startupDoneFxn");
        mcfgs.add("Object__count");
        icfgs.add("Object__count");
        mcfgs.add("Object__heap");
        icfgs.add("Object__heap");
        mcfgs.add("Object__sizeof");
        icfgs.add("Object__sizeof");
        mcfgs.add("Object__table");
        icfgs.add("Object__table");
        vo.bind("ModuleView", om.findStrict("ti.sysbios.hal.vayu.TimerSupport.ModuleView", "ti.sysbios.hal.vayu"));
        tdefs.add(om.findStrict("ti.sysbios.hal.vayu.TimerSupport.ModuleView", "ti.sysbios.hal.vayu"));
        mcfgs.add("a15TimerAvailMask");
        mcfgs.add("dsp0TimerAvailMask");
        mcfgs.add("dsp1TimerAvailMask");
        mcfgs.add("needDsp0XbarInit");
        mcfgs.add("needDsp1XbarInit");
        vo.bind("$$tdefs", Global.newArray(tdefs.toArray()));
        vo.bind("$$proxies", Global.newArray(proxies.toArray()));
        vo.bind("$$mcfgs", Global.newArray(mcfgs.toArray()));
        vo.bind("$$icfgs", Global.newArray(icfgs.toArray()));
        inherits.add("ti.sysbios.interfaces");
        inherits.add("xdc.runtime");
        vo.bind("$$inherits", Global.newArray(inherits.toArray()));
        ((Value.Arr)pkgV.getv("$modules")).add(vo);
        ((Value.Arr)om.findStrict("$modules", "ti.sysbios.hal.vayu")).add(vo);
        vo.bind("$$instflag", 0);
        vo.bind("$$iobjflag", 0);
        vo.bind("$$sizeflag", 1);
        vo.bind("$$dlgflag", 0);
        vo.bind("$$iflag", 1);
        vo.bind("$$romcfgs", "|");
        vo.bind("$$nortsflag", 0);
        if (isCFG) {
            Proto.Str ps = (Proto.Str)vo.find("Module_State");
            if (ps != null) vo.bind("$object", ps.newInstance());
            vo.bind("$$meta_iobj", 1);
        }//isCFG
        vo.bind("enable", om.findStrict("ti.sysbios.hal.vayu.TimerSupport.enable", "ti.sysbios.hal.vayu"));
        vo.bind("$$fxntab", Global.newArray("ti_sysbios_hal_vayu_TimerSupport_Module__startupDone__E", "ti_sysbios_hal_vayu_TimerSupport_enable__E"));
        vo.bind("$$logEvtCfgs", Global.newArray());
        vo.bind("$$errorDescCfgs", Global.newArray());
        vo.bind("$$assertDescCfgs", Global.newArray());
        Value.Map atmap = (Value.Map)vo.getv("$attr");
        atmap.setElem("", true);
        atmap.seal("length");
        vo.bind("MODULE_STARTUP$", 1);
        vo.bind("PROXY$", 0);
        loggables.clear();
        vo.bind("$$loggables", loggables.toArray());
        pkgV.bind("TimerSupport", vo);
        ((Value.Arr)pkgV.getv("$unitNames")).add("TimerSupport");
    }

    void $$INITIALIZATION()
    {
        Value.Obj vo;

        if (isCFG) {
        }//isCFG
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.sysbios.hal.vayu.IntXbar", "ti.sysbios.hal.vayu"));
        Global.callFxn("module$meta$init", (Scriptable)om.findStrict("ti.sysbios.hal.vayu.TimerSupport", "ti.sysbios.hal.vayu"));
        if (isCFG) {
            vo = (Value.Obj)om.findStrict("ti.sysbios.hal.vayu.IntXbar", "ti.sysbios.hal.vayu");
            Global.put(vo, "rovViewInfo", Global.callFxn("create", (Scriptable)om.find("xdc.rov.ViewInfo"), Global.newObject("viewMap", Global.newArray(new Object[]{Global.newArray(new Object[]{"XbarList", Global.newObject("type", om.find("xdc.rov.ViewInfo.MODULE_DATA"), "viewInitFxn", "viewInitData", "structName", "ModuleDataView")})}))));
        }//isCFG
        if (isCFG) {
            vo = (Value.Obj)om.findStrict("ti.sysbios.hal.vayu.TimerSupport", "ti.sysbios.hal.vayu");
            Global.put(vo, "rovViewInfo", Global.callFxn("create", (Scriptable)om.find("xdc.rov.ViewInfo"), Global.newObject("viewMap", Global.newArray(new Object[]{Global.newArray(new Object[]{"Module", Global.newObject("type", om.find("xdc.rov.ViewInfo.MODULE"), "viewInitFxn", "viewInitModule", "structName", "ModuleView")})}))));
        }//isCFG
        Global.callFxn("init", pkgV);
        ((Value.Obj)om.getv("ti.sysbios.hal.vayu.IntXbar")).bless();
        ((Value.Obj)om.getv("ti.sysbios.hal.vayu.TimerSupport")).bless();
        ((Value.Arr)om.findStrict("$packages", "ti.sysbios.hal.vayu")).add(pkgV);
    }

    public void exec( Scriptable xdcO, Session ses )
    {
        this.xdcO = xdcO;
        this.ses = ses;
        om = (Value.Obj)xdcO.get("om", null);

        Object o = om.geto("$name");
        String s = o instanceof String ? (String)o : null;
        isCFG = s != null && s.equals("cfg");
        isROV = s != null && s.equals("rov");

        $$IMPORTS();
        $$OBJECTS();
        IntXbar$$OBJECTS();
        TimerSupport$$OBJECTS();
        IntXbar$$CONSTS();
        TimerSupport$$CONSTS();
        IntXbar$$CREATES();
        TimerSupport$$CREATES();
        IntXbar$$FUNCTIONS();
        TimerSupport$$FUNCTIONS();
        IntXbar$$SIZES();
        TimerSupport$$SIZES();
        IntXbar$$TYPES();
        TimerSupport$$TYPES();
        if (isROV) {
            IntXbar$$ROV();
            TimerSupport$$ROV();
        }//isROV
        $$SINGLETONS();
        IntXbar$$SINGLETONS();
        TimerSupport$$SINGLETONS();
        $$INITIALIZATION();
    }
}
