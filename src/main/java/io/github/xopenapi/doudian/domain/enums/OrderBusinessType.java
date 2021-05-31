package io.github.xopenapi.doudian.domain.enums;

// 订单业务类型
public enum OrderBusinessType {

    Lu_Ban_Guang_Gao(1, "鲁班广告"),
    Lian_Meng(2, "联盟"),
    Shang_Cheng(4, "商城"),
    Zi_Zhu_Jing_Ying(8, "自主经营"),
    Xian_Suo_Tong_Order(10, "线索通支付表单"),
    Dou_Yin_Men_Dian(12, "抖音门店"),
    Dou_Jia(14, "抖+"),
    Chuan_Shan_JIa(15, "穿山甲");

    private int code;

    OrderBusinessType(int code, String desc) {
        this.code = code;
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
