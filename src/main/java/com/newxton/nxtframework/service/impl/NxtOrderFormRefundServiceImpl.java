package com.newxton.nxtframework.service.impl;

import com.newxton.nxtframework.dao.NxtOrderFormRefundDao;
import com.newxton.nxtframework.entity.NxtOrderFormRefund;
import com.newxton.nxtframework.service.NxtOrderFormRefundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (NxtOrderFormRefund)表服务实现类
 *
 * @author makejava
 * @since 2020-11-14 21:41:55
 */
@Service("nxtOrderFormRefundService")
public class NxtOrderFormRefundServiceImpl implements NxtOrderFormRefundService {
    @Resource
    private NxtOrderFormRefundDao nxtOrderFormRefundDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NxtOrderFormRefund queryById(Long id) {
        return this.nxtOrderFormRefundDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NxtOrderFormRefund> queryAllByLimit(int offset, int limit) {
        return this.nxtOrderFormRefundDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nxtOrderFormRefund 实例对象
     * @return 实例对象
     */
    @Override
    public NxtOrderFormRefund insert(NxtOrderFormRefund nxtOrderFormRefund) {
        this.nxtOrderFormRefundDao.insert(nxtOrderFormRefund);
        return nxtOrderFormRefund;
    }

    /**
     * 修改数据
     *
     * @param nxtOrderFormRefund 实例对象
     * @return 实例对象
     */
    @Override
    public NxtOrderFormRefund update(NxtOrderFormRefund nxtOrderFormRefund) {
        this.nxtOrderFormRefundDao.update(nxtOrderFormRefund);
        return this.queryById(nxtOrderFormRefund.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nxtOrderFormRefundDao.deleteById(id) > 0;
    }
}