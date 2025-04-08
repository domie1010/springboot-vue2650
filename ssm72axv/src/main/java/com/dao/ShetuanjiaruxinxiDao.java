package com.dao;

import com.entity.ShetuanjiaruxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanjiaruxinxiVO;
import com.entity.view.ShetuanjiaruxinxiView;


/**
 * 社团加入信息
 * 
 * @author 
 * @email 
 * @date 2021-04-22 16:36:09
 */
public interface ShetuanjiaruxinxiDao extends BaseMapper<ShetuanjiaruxinxiEntity> {
	
	List<ShetuanjiaruxinxiVO> selectListVO(@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);
	
	ShetuanjiaruxinxiVO selectVO(@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);
	
	List<ShetuanjiaruxinxiView> selectListView(@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);

	List<ShetuanjiaruxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);
	
	ShetuanjiaruxinxiView selectView(@Param("ew") Wrapper<ShetuanjiaruxinxiEntity> wrapper);
	
}
