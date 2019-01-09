package com.abdihakim.aninterface;

public class KickBoxer implements  Fighting{
    @Override
    public String throwJab() {
        return "Throw harder jab";
    }

    @Override
    public String throwCross() {
        return "Throw harder cross";
    }

    @Override
    public String throwHook() {
        return "Throw harder Hook";
    }

    @Override
    public String throwUppercut() {
        return "Throw harder uppercut";
    }
}
