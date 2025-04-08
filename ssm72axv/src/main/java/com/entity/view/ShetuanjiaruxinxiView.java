package com.entity.view;

import com.entity.ShetuanjiaruxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团加入信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-22 16:36:09
 */
@TableName("shetuanjiaruxinxi")
public class ShetuanjiaruxinxiView  extends ShetuanjiaruxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShetuanjiaruxinxiView(){
	}
 
 	public ShetuanjiaruxinxiView(ShetuanjiaruxinxiEntity shetuanjiaruxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shetuanjiaruxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
