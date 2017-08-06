package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	//注入mapper
	@Autowired
	private TbItemMapper itemMapper;
	
	
	public TbItem findById(Long id) {
		TbItem item = itemMapper.selectByPrimaryKey(id);
		return item;
	}

}
