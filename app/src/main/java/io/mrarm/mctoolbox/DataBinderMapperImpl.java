package io.mrarm.mctoolbox;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends gj {
    public static final SparseIntArray a;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(36);
            a = hashMap;
            hashMap.put("layout/activity_diagnostic_0", 2131492892);
            hashMap.put("layout/activity_error_0", 2131492893);
            hashMap.put("layout/category_list_item_0", 2131492899);
            hashMap.put("layout/dialog_color_picker_0", 2131492916);
            hashMap.put("layout/dialog_command_edit_0", 2131492917);
            hashMap.put("layout/dialog_enchant_0", 2131492919);
            hashMap.put("layout/dialog_enchant_entry_0", 2131492920);
            hashMap.put("layout/dialog_enchant_header_0", 2131492921);
            hashMap.put("layout/dialog_enchant_separator_0", 2131492922);
            hashMap.put("layout/dialog_item_pick_0", 2131492924);
            hashMap.put("layout/dialog_nbt_editor_0", 2131492925);
            hashMap.put("layout/dialog_nbt_editor_add_0", 2131492926);
            hashMap.put("layout/dialog_nbt_preset_edit_0", 2131492928);
            hashMap.put("layout/dialog_settings_0", 2131492930);
            hashMap.put("layout/list_action_0", 2131492932);
            hashMap.put("layout/list_add_0", 2131492933);
            hashMap.put("layout/list_color_0", 2131492934);
            hashMap.put("layout/list_command_0", 2131492935);
            hashMap.put("layout/list_command_header_0", 2131492936);
            hashMap.put("layout/list_shortcut_0", 2131492937);
            hashMap.put("layout/list_slider_0", 2131492938);
            hashMap.put("layout/list_text_edit_0", 2131492939);
            hashMap.put("layout/list_toggle_0", 2131492940);
            hashMap.put("layout/list_toggle_locked_0", 2131492941);
            hashMap.put("layout/nbt_preset_list_add_0", 2131492972);
            hashMap.put("layout/nbt_preset_list_entry_0", 2131492973);
            hashMap.put("layout/nbt_tag_compound_0", 2131492974);
            hashMap.put("layout/nbt_tag_root_0", 2131492975);
            hashMap.put("layout/nbt_tag_string_0", 2131492976);
            hashMap.put("layout/player_list_item_0", 2131492983);
            hashMap.put("layout/shortcut_list_item_0", 2131492987);
            hashMap.put("layout/simple_ad_activity_0", 2131492988);
            hashMap.put("layout/simple_list_header_0", 2131492989);
            hashMap.put("layout/toolbar_icon_0", 2131493004);
            hashMap.put("layout/toolbar_separator_0", 2131493005);
            hashMap.put("layout/user_icon_0", 2131493008);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(36);
        a = sparseIntArray;
        sparseIntArray.put(2131492892, 1);
        sparseIntArray.put(2131492893, 2);
        sparseIntArray.put(2131492899, 3);
        sparseIntArray.put(2131492916, 4);
        sparseIntArray.put(2131492917, 5);
        sparseIntArray.put(2131492919, 6);
        sparseIntArray.put(2131492920, 7);
        sparseIntArray.put(2131492921, 8);
        sparseIntArray.put(2131492922, 9);
        sparseIntArray.put(2131492924, 10);
        sparseIntArray.put(2131492925, 11);
        sparseIntArray.put(2131492926, 12);
        sparseIntArray.put(2131492928, 13);
        sparseIntArray.put(2131492930, 14);
        sparseIntArray.put(2131492932, 15);
        sparseIntArray.put(2131492933, 16);
        sparseIntArray.put(2131492934, 17);
        sparseIntArray.put(2131492935, 18);
        sparseIntArray.put(2131492936, 19);
        sparseIntArray.put(2131492937, 20);
        sparseIntArray.put(2131492938, 21);
        sparseIntArray.put(2131492939, 22);
        sparseIntArray.put(2131492940, 23);
        sparseIntArray.put(2131492941, 24);
        sparseIntArray.put(2131492972, 25);
        sparseIntArray.put(2131492973, 26);
        sparseIntArray.put(2131492974, 27);
        sparseIntArray.put(2131492975, 28);
        sparseIntArray.put(2131492976, 29);
        sparseIntArray.put(2131492983, 30);
        sparseIntArray.put(2131492987, 31);
        sparseIntArray.put(2131492988, 32);
        sparseIntArray.put(2131492989, 33);
        sparseIntArray.put(2131493004, 34);
        sparseIntArray.put(2131493005, 35);
        sparseIntArray.put(2131493008, 36);
    }

    @Override // defpackage.gj
    public final List<gj> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.gj
    public final ViewDataBinding b(hj hjVar, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i2) {
                    case 1:
                        if ("layout/activity_diagnostic_0".equals(tag)) {
                            return new l1(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for activity_diagnostic is invalid. Received: ", tag));
                    case 2:
                        if ("layout/activity_error_0".equals(tag)) {
                            return new n1(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for activity_error is invalid. Received: ", tag));
                    case 3:
                        if ("layout/category_list_item_0".equals(tag)) {
                            return new nc(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for category_list_item is invalid. Received: ", tag));
                    case 4:
                        if ("layout/dialog_color_picker_0".equals(tag)) {
                            return new xk(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_color_picker is invalid. Received: ", tag));
                    case 5:
                        if ("layout/dialog_command_edit_0".equals(tag)) {
                            return new zk(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_command_edit is invalid. Received: ", tag));
                    case 6:
                        if ("layout/dialog_enchant_0".equals(tag)) {
                            return new bl(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_enchant is invalid. Received: ", tag));
                    case 7:
                        if ("layout/dialog_enchant_entry_0".equals(tag)) {
                            return new dl(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_enchant_entry is invalid. Received: ", tag));
                    case 8:
                        if ("layout/dialog_enchant_header_0".equals(tag)) {
                            return new fl(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_enchant_header is invalid. Received: ", tag));
                    case 9:
                        if ("layout/dialog_enchant_separator_0".equals(tag)) {
                            return new hl(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_enchant_separator is invalid. Received: ", tag));
                    case 10:
                        if ("layout/dialog_item_pick_0".equals(tag)) {
                            return new kl(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_item_pick is invalid. Received: ", tag));
                    case 11:
                        if ("layout/dialog_nbt_editor_0".equals(tag)) {
                            return new ol(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_nbt_editor is invalid. Received: ", tag));
                    case 12:
                        if ("layout/dialog_nbt_editor_add_0".equals(tag)) {
                            return new ml(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_nbt_editor_add is invalid. Received: ", tag));
                    case 13:
                        if ("layout/dialog_nbt_preset_edit_0".equals(tag)) {
                            return new ql(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_nbt_preset_edit is invalid. Received: ", tag));
                    case 14:
                        if ("layout/dialog_settings_0".equals(tag)) {
                            return new sl(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for dialog_settings is invalid. Received: ", tag));
                    case 15:
                        if ("layout/list_action_0".equals(tag)) {
                            return new i10(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_action is invalid. Received: ", tag));
                    case 16:
                        if ("layout/list_add_0".equals(tag)) {
                            return new k10(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_add is invalid. Received: ", tag));
                    case 17:
                        if ("layout/list_color_0".equals(tag)) {
                            return new l10(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_color is invalid. Received: ", tag));
                    case 18:
                        if ("layout/list_command_0".equals(tag)) {
                            return new n10(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_command is invalid. Received: ", tag));
                    case 19:
                        if ("layout/list_command_header_0".equals(tag)) {
                            return new p10(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_command_header is invalid. Received: ", tag));
                    case 20:
                        if ("layout/list_shortcut_0".equals(tag)) {
                            return new y10(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_shortcut is invalid. Received: ", tag));
                    case 21:
                        if ("layout/list_slider_0".equals(tag)) {
                            return new a20(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_slider is invalid. Received: ", tag));
                    case 22:
                        if ("layout/list_text_edit_0".equals(tag)) {
                            return new c20(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_text_edit is invalid. Received: ", tag));
                    case 23:
                        if ("layout/list_toggle_0".equals(tag)) {
                            return new e20(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_toggle is invalid. Received: ", tag));
                    case 24:
                        if ("layout/list_toggle_locked_0".equals(tag)) {
                            return new f20(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for list_toggle_locked is invalid. Received: ", tag));
                    case 25:
                        if ("layout/nbt_preset_list_add_0".equals(tag)) {
                            return new u80(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for nbt_preset_list_add is invalid. Received: ", tag));
                    case 26:
                        if ("layout/nbt_preset_list_entry_0".equals(tag)) {
                            return new v80(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for nbt_preset_list_entry is invalid. Received: ", tag));
                    case 27:
                        if ("layout/nbt_tag_compound_0".equals(tag)) {
                            return new x80(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for nbt_tag_compound is invalid. Received: ", tag));
                    case 28:
                        if ("layout/nbt_tag_root_0".equals(tag)) {
                            return new z80(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for nbt_tag_root is invalid. Received: ", tag));
                    case 29:
                        if ("layout/nbt_tag_string_0".equals(tag)) {
                            return new b90(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for nbt_tag_string is invalid. Received: ", tag));
                    case 30:
                        if ("layout/player_list_item_0".equals(tag)) {
                            return new df0(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for player_list_item is invalid. Received: ", tag));
                    case 31:
                        if ("layout/shortcut_list_item_0".equals(tag)) {
                            return new as0(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for shortcut_list_item is invalid. Received: ", tag));
                    case 32:
                        if ("layout/simple_ad_activity_0".equals(tag)) {
                            return new gs0(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for simple_ad_activity is invalid. Received: ", tag));
                    case 33:
                        if ("layout/simple_list_header_0".equals(tag)) {
                            return new ws0(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for simple_list_header is invalid. Received: ", tag));
                    case 34:
                        if ("layout/toolbar_icon_0".equals(tag)) {
                            return new ux0(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for toolbar_icon is invalid. Received: ", tag));
                    case 35:
                        if ("layout/toolbar_separator_0".equals(tag)) {
                            return new wx0(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for toolbar_separator is invalid. Received: ", tag));
                    case 36:
                        if ("layout/user_icon_0".equals(tag)) {
                            return new x21(view, hjVar);
                        }
                        throw new IllegalArgumentException(ij.b("The tag for user_icon is invalid. Received: ", tag));
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // defpackage.gj
    public final ViewDataBinding c(hj hjVar, View[] viewArr, int i) {
        if (viewArr.length != 0 && a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // defpackage.gj
    public final int d(String str) {
        Integer num;
        if (str == null || (num = a.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}