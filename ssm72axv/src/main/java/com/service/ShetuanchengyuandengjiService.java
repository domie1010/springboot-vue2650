package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanchengyuandengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanchengyuandengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanchengyuandengjiView;


/**
 * 社团成员登记
 *
 * @author 
 * @email 
 * @date 2021-04-22 16:36:09
 */
public interface ShetuanchengyuandengjiService extends IService<ShetuanchengyuandengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanchengyuandengjiVO> selectListVO(Wrapper<ShetuanchengyuandengjiEntity> wrapper);
   	
   	ShetuanchengyuandengjiVO selectVO(@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);
   	
   	List<ShetuanchengyuandengjiView> selectListView(Wrapper<ShetuanchengyuandengjiEntity> wrapper);
   	
   	ShetuanchengyuandengjiView selectView(@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanchengyuandengjiEntity> wrapper);
   	
}

