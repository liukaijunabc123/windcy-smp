package com.example.model.auto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 老年人补贴制度表
 * </p>
 *
 * @author liukj
 * @since 2020-12-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SubsidyRule extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 补贴制度ID
     */
    @TableId("SUBSIDY_ID")
    private String subsidyId;

    /**
     * 补贴制度名称
     */
    @TableField("SUBSIDY_NAME")
    private String subsidyName;

    /**
     * 政策依据
     */
    @TableField("POLICY_BASIS")
    private String policyBasis;

    /**
     * 行使层级-省
     */
    @TableField("USER_PROVINCE")
    private String userProvince;

    /**
     * 形势层级-市
     */
    @TableField("USE_CITY")
    private String useCity;

    /**
     * 资金来源
     */
    @TableField("CAPITAL_SOURCE")
    private String capitalSource;

    /**
     * 执行时间
     */
    @TableField("EXECUTION_TIME")
    private LocalDateTime executionTime;

    /**
     * 发放周期
     */
    @TableField("PROVIDE_PERIOD")
    private String providePeriod;

    /**
     * 补贴范围
     */
    @TableField("SUBSIDY_AREA")
    private String subsidyArea;

    /**
     * 创建人ID
     */
    @TableField("CREATE_ID")
    private String createId;

    /**
     * 创建人姓名
     */
    @TableField("CREATE_NAME")
    private String createName;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    /**
     * 数据状态 0--正常  1--逻辑删除
     */
    @TableField("DATA_STATUS")
    private String dataStatus;

    /**
     * 数据状态 0--生效中  1--已失效 2--未发布
     */
    @TableField("RELEASE_STATUS")
    private String releaseStatus;

    /**
     * 生效时间
     */
    @TableField("EFFECT_DATE")
    private LocalDateTime effectDate;


}
