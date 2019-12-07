package com.sampleservice.wechatservice.controller;

import com.sampleservice.wechatservice.utils.MBaseUtils;
import com.septemberhx.common.base.MResponse;
import com.septemberhx.mclient.annotation.MApiFunction;
import com.septemberhx.mclient.annotation.MRestApiType;
import com.septemberhx.mclient.base.MObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author SeptemberHX
 * @version 0.1
 * @date 2019/11/25
 */
@RestController
public class MainController extends MObject {

    @ResponseBody
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    @MRestApiType
    @MApiFunction
    public MResponse payFunction(@RequestBody MResponse requestData) {
        MResponse result = new MResponse();
        result.set("msg", "/pay");

        if (requestData.get("interval") != null) {
            MBaseUtils.generateStringInKBSize(10, result, (long) requestData.get("interval"));
        }
        return result;
    }
}
