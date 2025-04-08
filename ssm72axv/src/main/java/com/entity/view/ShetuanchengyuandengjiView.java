package com.entity.view;

import com.entity.ShetuanchengyuandengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团成员登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 16:36:09
 */
@TableName("shetuanchengyuandengji")
public class ShetuanchengyuandengjiView  extends ShetuanchengyuandengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanchengyuandengjiView(){
	}
 
 	public ShetuanchengyuandengjiView(ShetuanchengyuandengjiEntity shetuanchengyuandengjiEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanchengyuandengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
