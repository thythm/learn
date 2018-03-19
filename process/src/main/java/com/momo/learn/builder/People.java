package com.momo.learn.builder;

import lombok.Data;

/**
 * @author majunjie
 * @date 2018/3/17 15:16
 */
@Data
public class People {

    private String var1;
    private String var2;
    private String var3;
    private String var4;
    private String var5;
    private String var6;
    private String var7;
    private String var8;
    private String var9;
    private String var10;

    private People(PeopleBuilder builder) {
        this.var1 = builder.getNestedVar1();
        this.var2 = builder.getNestedVar2();
        this.var3 = builder.getNestedVar3();
        this.var4 = builder.getNestedVar4();
        this.var5 = builder.getNestedVar5();
        this.var6 = builder.getNestedVar6();
        this.var7 = builder.getNestedVar7();
        this.var8 = builder.getNestedVar8();
        this.var9 = builder.getNestedVar9();
        this.var10 = builder.getNestedVar10();
    }

    @Data
    public static class PeopleBuilder {

        private String nestedVar1;
        private String nestedVar2;
        private String nestedVar3;
        private String nestedVar4;
        private String nestedVar5;
        private String nestedVar6;
        private String nestedVar7;
        private String nestedVar8;
        private String nestedVar9;
        private String nestedVar10;

        /**
         * 构造器
         * @param nestedVar1
         * @param nestedVar2
         * @param nestedVar3
         */
        public PeopleBuilder(String nestedVar1, String nestedVar2, String nestedVar3){
            this.nestedVar1 = nestedVar1;
            this.nestedVar2 = nestedVar2;
            this.nestedVar3 = nestedVar3;
        }

        public PeopleBuilder nestedVar1(String nestedVar1) {
            this.nestedVar1 = nestedVar1;
            return this;
        }
        public PeopleBuilder nestedVar2(String nestedVar2) {
            this.nestedVar2 = nestedVar2;
            return this;
        }
        public PeopleBuilder nestedVar3(String nestedVar3) {
            this.nestedVar3 = nestedVar3;
            return this;
        }
        public PeopleBuilder nestedVar4(String nestedVar4) {
            this.nestedVar4 = nestedVar4;
            return this;
        }
        public PeopleBuilder nestedVar5(String nestedVar5) {
            this.nestedVar5 = nestedVar5;
            return this;
        }
        public PeopleBuilder nestedVar6(String nestedVar6) {
            this.nestedVar6 = nestedVar6;
            return this;
        }
        public PeopleBuilder nestedVar7(String nestedVar7) {
            this.nestedVar7 = nestedVar7;
            return this;
        }
        public PeopleBuilder nestedVar8(String nestedVar8) {
            this.nestedVar8 = nestedVar8;
            return this;
        }
        public PeopleBuilder nestedVar9(String nestedVar9) {
            this.nestedVar9 = nestedVar9;
            return this;
        }
        public PeopleBuilder nestedVar10(String nestedVar10) {
            this.nestedVar10 = nestedVar10;
            return this;
        }

        public People build(){
            return new People(this);
        }

    }

}
