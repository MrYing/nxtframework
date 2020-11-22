package com.newxton.nxtframework.service.impl;

import com.newxton.nxtframework.dao.NxtWithdrawDao;
import com.newxton.nxtframework.entity.NxtWithdraw;
import com.newxton.nxtframework.service.NxtWithdrawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (NxtWithdraw)表服务实现类
 *
 * @author makejava
 * @since 2020-11-14 21:45:50
 */
@Service("nxtWithdrawService")
public class NxtWithdrawServiceImpl implements NxtWithdrawService {
    @Resource
    private NxtWithdrawDao nxtWithdrawDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NxtWithdraw queryById(Long id) {
        return this.nxtWithdrawDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<NxtWithdraw> queryAllByLimit(int offset, int limit) {
        return this.nxtWithdrawDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nxtWithdraw 实例对象
     * @return 实例对象
     */
    @Override
    public NxtWithdraw insert(NxtWithdraw nxtWithdraw) {
        this.nxtWithdrawDao.insert(nxtWithdraw);
        return nxtWithdraw;
    }

    /**
     * 修改数据
     *
     * @param nxtWithdraw 实例对象
     * @return 实例对象
     */
    @Override
    public NxtWithdraw update(NxtWithdraw nxtWithdraw) {
        this.nxtWithdrawDao.update(nxtWithdraw);
        return this.queryById(nxtWithdraw.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nxtWithdrawDao.deleteById(id) > 0;
    }
}