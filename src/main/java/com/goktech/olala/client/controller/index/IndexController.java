package com.goktech.olala.client.controller.index;

import com.goktech.olala.core.resp.RespBrandVo;
import com.goktech.olala.core.resp.RespCategoryVo;
import com.goktech.olala.core.service.IActivitService;
import com.goktech.olala.core.service.IAdversService;
import com.goktech.olala.core.service.IArticleService;
import com.goktech.olala.core.service.ICategoryService;
import com.goktech.olala.server.pojo.goods.Activit;
import com.goktech.olala.server.pojo.goods.Advers;
import com.goktech.olala.server.pojo.goods.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author sanming
 * @Classname IndexController
 * @Description
 * @Date 2020/11/27 20:41
 */
@RestController
public class IndexController {
    //头条
    @Autowired
    IArticleService articleService;
    //轮播图
    @Autowired
    IAdversService iAdversService;
    //热门活动
    @Autowired
    IActivitService iActivitService;

    @Autowired
    ICategoryService iCategoryService;

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("redirect:index/init.do");
        return mav;
    }


    @RequestMapping("/index/init.do")
    public ModelAndView toIndex(){
        ModelAndView mav=new ModelAndView();

        //头条
        List<Article> articles = articleService.selectAll();
        mav.addObject("articleVoList",articles);

        //轮播图
        List<Advers> advers = iAdversService.selectAll();
        mav.addObject("ctmAdvers",advers);

        //热门活动
        List<Activit> activits = iActivitService.selectAll();
        mav.addObject("indexActivities",activits);
        //分类
        List<RespCategoryVo> respCategoryVos = iCategoryService.slectCategory();
        for (RespCategoryVo first:respCategoryVos) {
            List<RespBrandVo> brands = iCategoryService.selectBrand();
            if(brands!=null){
                first.setBrandList(brands);
            }
        }
        mav.addObject("categoryList",respCategoryVos);

        mav.setViewName("home/index");
        return  mav;
    }

}
