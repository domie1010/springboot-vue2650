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


import com.dao.ShetuanchengyuandengjiDao;
import com.entity.ShetuanchengyuandengjiEntity;
import com.service.ShetuanchengyuandengjiService;
import com.entity.vo.ShetuanchengyuandengjiVO;
import com.entity.view.ShetuanchengyuandengjiView;

@Service("shetuanchengyuandengjiService")
public class ShetuanchengyuandengjiServiceImpl extends ServiceImpl<ShetuanchengyuandengjiDao, ShetuanchengyuandengjiEntity> implements ShetuanchengyuandengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanchengyuandengjiEntity> page = this.selectPage(
                new Query<ShetuanchengyuandengjiEntity>(params).getPage(),
                new EntityWrapper<ShetuanchengyuandengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanchengyuandengjiEntity> wrapper) {
		  Page<ShetuanchengyuandengjiView> page =new Query<ShetuanchengyuandengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanchengyuandengjiVO> selectListVO(Wrapper<ShetuanchengyuandengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanchengyuandengjiVO selectVO(Wrapper<ShetuanchengyuandengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanchengyuandengjiView> selectListView(Wrapper<ShetuanchengyuandengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanchengyuandengjiView selectView(Wrapper<ShetuanchengyuandengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
