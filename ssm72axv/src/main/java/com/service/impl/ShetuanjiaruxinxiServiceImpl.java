package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShetuanjiaruxinxiDao;
import com.entity.ShetuanjiaruxinxiEntity;
import com.service.ShetuanjiaruxinxiService;
import com.entity.vo.ShetuanjiaruxinxiVO;
import com.entity.view.ShetuanjiaruxinxiView;

@Service("shetuanjiaruxinxiService")
public class ShetuanjiaruxinxiServiceImpl extends ServiceImpl<ShetuanjiaruxinxiDao, ShetuanjiaruxinxiEntity> implements ShetuanjiaruxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanjiaruxinxiEntity> page = this.selectPage(
                new Query<ShetuanjiaruxinxiEntity>(params).getPage(),
                new EntityWrapper<ShetuanjiaruxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanjiaruxinxiEntity> wrapper) {
		  Page<ShetuanjiaruxinxiView> page =new Query<ShetuanjiaruxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanjiaruxinxiVO> selectListVO(Wrapper<ShetuanjiaruxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanjiaruxinxiVO selectVO(Wrapper<ShetuanjiaruxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanjiaruxinxiView> selectListView(Wrapper<ShetuanjiaruxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanjiaruxinxiView selectView(Wrapper<ShetuanjiaruxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
