package com.goktech.olala.client.controller.index;

import com.goktech.olala.core.req.ReqGoodKey;
import com.goktech.olala.core.service.IGoodsService;
import com.goktech.olala.server.pojo.goods.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Classname IndexGoodsController
 * @Description TODO
 * @Date 2020/12/5 20:24
 * @Created by sanming
 */
@RestController
@RequestMapping("/goodsIndexApi")
public class IndexGoodsController {
    @Autowired
    IGoodsService iGoodsService;

    @RequestMapping("/queryGoodsByParam.do")
    public ModelAndView queryGoodsByParam(HttpServletRequest request){
        ModelAndView mav=new ModelAndView();

        String keywords = request.getParameter("keywords");

        ReqGoodKey goodKey=new ReqGoodKey();

        goodKey.setKeywords(keywords);

        List<Good> goods = iGoodsService.selectByKey(goodKey);

        mav.addObject("goodsList",goods);
        mav.setViewName("home/search");
        return mav;
    }

}
