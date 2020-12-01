package com.newxton.nxtframework.service;

import com.newxton.nxtframework.entity.NxtShoppingCartProduct;

import java.util.List;

/**
 * (NxtShoppingCartProduct)表服务接口
 *
 * @author makejava
 * @since 2020-11-14 21:45:47
 */
public interface NxtShoppingCartProductService {
	
	/**
     * 通过shoppingCartId、productId查询对象列表
     *
     * @param shoppingCartId 购物车主键
     * @param productId 产品主键
     * @return 对象列表
     */
	List<NxtShoppingCartProduct> queryByShoppingCartIdProductId(Long shoppingCartId, Long productId);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    NxtShoppingCartProduct queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NxtShoppingCartProduct> queryAllByLimit(int offset, int limit);

    /**
     * 查询指定购物车内所有选中的产品
     * @param shoppingCartId
     * @return
     */
    List<NxtShoppingCartProduct> queryAllSelectedProductByShoppingCartId(Long shoppingCartId);

    /**
     * 查询指定购物车内所有选中的产品
     * @param shoppingCartId
     * @return
     */
    List<NxtShoppingCartProduct> queryAllProductByShoppingCartId(Long shoppingCartId);


    /**
     * 新增数据
     *
     * @param nxtShoppingCartProduct 实例对象
     * @return 实例对象
     */
    NxtShoppingCartProduct insert(NxtShoppingCartProduct nxtShoppingCartProduct);

    /**
     * 修改数据
     *
     * @param nxtShoppingCartProduct 实例对象
     * @return 实例对象
     */
    NxtShoppingCartProduct update(NxtShoppingCartProduct nxtShoppingCartProduct);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}