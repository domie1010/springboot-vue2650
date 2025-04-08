package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanjiaruxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanjiaruxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanjiaruxinxiView;


/**
 * 社团加入信息
 *
 * @author 
 * @email 
 * @date 2021-04-22 16:36:09
 */
public interface ShetuanjiaruxinxiService extends IService<ShetuanjiaruxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanjiaruxinxiVO> selectListVO(Wrapper<ShetuanjiaruxinxiEntity> wrapper);
   	
   	ShetuanjiaruxinxiVO selectVO(@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);
   	
   	List<ShetuanjiaruxinxiView> selectListView(Wrapper<ShetuanjiaruxinxiEntity> wrapper);
   	
   	ShetuanjiaruxinxiView selectView(@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanjiaruxinxiEntity> wrapper);
   	
}

