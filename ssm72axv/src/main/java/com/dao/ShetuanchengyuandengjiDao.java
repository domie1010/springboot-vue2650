package com.dao;

import com.entity.ShetuanchengyuandengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanchengyuandengjiVO;
import com.entity.view.ShetuanchengyuandengjiView;


/**
 * 社团成员登记
 * 
 * @author 
 * @email 
 * @date 2021-04-22 16:36:09
 */
public interface ShetuanchengyuandengjiDao extends BaseMapper<ShetuanchengyuandengjiEntity> {
	
	List<ShetuanchengyuandengjiVO> selectListVO(@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);
	
	ShetuanchengyuandengjiVO selectVO(@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);
	
	List<ShetuanchengyuandengjiView> selectListView(@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);

	List<ShetuanchengyuandengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);
	
	ShetuanchengyuandengjiView selectView(@Param("ew") Wrapper<ShetuanchengyuandengjiEntity> wrapper);
	
}
