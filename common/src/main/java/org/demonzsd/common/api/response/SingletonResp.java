package org.demonzsd.common.api.response;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.demonzsd.common.api.RespCode;
import org.demonzsd.common.api.RespMsg;

/**
 * SingletonResp construct an instance with singleton T object
 *
 * @author by DemonZSD
 */
@Getter
public class SingletonResp<T> extends BaseResp{
    private T data;

    public static SingletonResp builder(){
        return new SingletonResp(new BaseResp(RespCode.SUCCESS_CODE, RespMsg.RESP_OK));
    }

    public SingletonResp(String code, String msg) {
        super(code, msg);
    }

    public SingletonResp(BaseResp baseResp) {
        super(baseResp);
    }

    public static SingletonResp success(String msg, Object data){
        SingletonResp resp = new SingletonResp(RespCode.SUCCESS_CODE,
                        StringUtils.isNotEmpty(msg)?msg : RespMsg.RESP_OK);
        if(data != null){
            resp.setData(data);
        }
        return resp;
    }

    public static SingletonResp failed(String code, String msg){
        return new SingletonResp(code, StringUtils.isNotEmpty(msg) ? msg : RespMsg.RESP_FAILED);
    }

    public void setData(T data) {
        this.data = data;
    }
}
