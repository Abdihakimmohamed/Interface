package com.abdihakim.aninterface;

public class Boxer implements Fighting {

    @Override
    public String throwJab() {
        return "Throw faster jab";
    }

    @Override
    public String throwCross() {
        return "Throw faster cross";
    }

    @Override
    public String throwHook() {
        return "Throw faster hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw faster uppercut";
    }
}
