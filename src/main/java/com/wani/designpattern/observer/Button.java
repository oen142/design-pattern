package com.wani.designpattern.observer;

public class Button {

    private OnClickListener onClickListener;

    public void onClick() {
        //이벤트 처리
        if (onClickListener != null)
            onClickListener.onClick(this);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        void onClick(Button button);
    }

}
