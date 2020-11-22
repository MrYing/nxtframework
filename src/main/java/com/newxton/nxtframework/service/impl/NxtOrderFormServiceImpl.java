package com.newxton.nxtframework.service.impl;

import com.newxton.nxtframework.entity.NxtOrderForm;
import com.newxton.nxtframework.dao.NxtOrderFormDao;
import com.newxton.nxtframework.service.NxtOrderFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (NxtOrderForm)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 11:11:07
 */
@Service("nxtOrderFormService")
public class NxtOrderFormServiceImpl implements NxtOrderFormService {
    @Resource
    private NxtOrderFormDao nxtOrderFormDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NxtOrderForm queryById(Long id) {
        return this.nxtOrderFormDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<NxtOrderForm> queryAllByLimit(int offset, int limit) {
        return this.nxtOrderFormDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param nxtOrderForm 实例对象
     * @return 实例对象
     */
    @Override
    public NxtOrderForm insert(NxtOrderForm nxtOrderForm) {
        this.nxtOrderFormDao.insert(nxtOrderForm);
        return nxtOrderForm;
    }

    /**
     * 修改数据
     *
     * @param nxtOrderForm 实例对象
     * @return 实例对象
     */
    @Override
    public NxtOrderForm update(NxtOrderForm nxtOrderForm) {
        this.nxtOrderFormDao.update(nxtOrderForm);
        return this.queryById(nxtOrderForm.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nxtOrderFormDao.deleteById(id) > 0;
    }
}