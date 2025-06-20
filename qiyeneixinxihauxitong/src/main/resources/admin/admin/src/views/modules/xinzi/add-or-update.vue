<template>
  <div class="addEdit-block">
    <el-form
        class="detail-form-content"
        ref="ruleForm"
        :model="ruleForm"
        :rules="rules"
        label-width="auto"
    >
      <el-row>
        <el-col :span="12" v-if="sessionTable !='yonghu'">
          <el-form-item class="select" v-if="type!='info'" label="用户" prop="yonghuId">
            <el-select v-model="ruleForm.yonghuId" :disabled="ro.yonghuId" filterable placeholder="请选择用户"
                       @change="yonghuChange">
              <el-option
                  v-for="(item,index) in yonghuOptions"
                  v-bind:key="item.id"
                  :label="item.yonghuName"
                  :value="item.id">
              </el-option>
            </el-select>
          </el-form-item>
        </el-col>

        <el-col :span="12" v-if="sessionTable !='yonghu' ">
          <el-form-item class="input" v-if="type!='info'" label="用户编号" prop="yonghuUuidNumber">
            <el-input v-model="yonghuForm.yonghuUuidNumber"
                      placeholder="用户编号" clearable readonly></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="用户编号" prop="yonghuUuidNumber">
              <el-input v-model="ruleForm.yonghuUuidNumber"
                        placeholder="用户编号" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12" v-if="sessionTable !='yonghu' ">
          <el-form-item class="input" v-if="type!='info'" label="用户姓名" prop="yonghuName">
            <el-input v-model="yonghuForm.yonghuName"
                      placeholder="用户姓名" clearable readonly></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="用户姓名" prop="yonghuName">
              <el-input v-model="ruleForm.yonghuName"
                        placeholder="用户姓名" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12" v-if="sessionTable !='yonghu' ">
          <el-form-item class="input" v-if="type!='info'" label="用户手机号" prop="yonghuPhone">
            <el-input v-model="yonghuForm.yonghuPhone"
                      placeholder="用户手机号" clearable readonly></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="用户手机号" prop="yonghuPhone">
              <el-input v-model="ruleForm.yonghuPhone"
                        placeholder="用户手机号" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12" v-if="sessionTable !='yonghu' ">
          <el-form-item class="input" v-if="type!='info'" label="用户身份证号" prop="yonghuIdNumber">
            <el-input v-model="yonghuForm.yonghuIdNumber"
                      placeholder="用户身份证号" clearable readonly></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="用户身份证号" prop="yonghuIdNumber">
              <el-input v-model="ruleForm.yonghuIdNumber"
                        placeholder="用户身份证号" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12" v-if="sessionTable !='yonghu' ">
          <el-form-item class="upload" v-if="type!='info' && !ro.yonghuPhoto" label="用户头像" prop="yonghuPhoto">
            <img style="margin-right:20px;" v-bind:key="index"
                 v-for="(item,index) in (yonghuForm.yonghuPhoto || '').split(',')" :src="$base.url+item" width="100"
                 height="100">
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item v-if="ruleForm.yonghuPhoto" label="用户头像" prop="yonghuPhoto">
              <img style="margin-right:20px;" v-bind:key="index"
                   v-for="(item,index) in (ruleForm.yonghuPhoto || '').split(',')" :src="$base.url+item" width="100"
                   height="100">
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12" v-if="sessionTable !='yonghu' ">
          <el-form-item class="input" v-if="type!='info'" label="用户邮箱" prop="yonghuEmail">
            <el-input v-model="yonghuForm.yonghuEmail"
                      placeholder="用户邮箱" clearable readonly></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="用户邮箱" prop="yonghuEmail">
              <el-input v-model="ruleForm.yonghuEmail"
                        placeholder="用户邮箱" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <input id="updateId" name="id" type="hidden">
        <input id="yonghuId" name="yonghuId" type="hidden">
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="薪资编号" prop="xinziUuidNumber">
            <el-input v-model="ruleForm.xinziUuidNumber"
                      placeholder="薪资编号" clearable :readonly="ro.xinziUuidNumber"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="薪资编号" prop="xinziUuidNumber">
              <el-input v-model="ruleForm.xinziUuidNumber"
                        placeholder="薪资编号" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="标题" prop="xinziName">
            <el-input v-model="ruleForm.xinziName"
                      placeholder="标题" clearable :readonly="ro.xinziName"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="标题" prop="xinziName">
              <el-input v-model="ruleForm.xinziName"
                        placeholder="标题" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="月份" prop="xinziMonth">
            <el-input v-model="ruleForm.xinziMonth" type="month"
                      placeholder="月份" clearable :readonly="ro.xinziMonth"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="月份" prop="xinziMonth">
              <el-input v-model="ruleForm.xinziMonth"
                        placeholder="月份" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="岗位工资" prop="jibenJine">
            <el-input v-model="ruleForm.jibenJine"
                      placeholder="岗位工资" clearable :readonly="ro.jibenJine"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="岗位工资" prop="jibenJine">
              <el-input v-model="ruleForm.jibenJine"
                        placeholder="岗位工资" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="薪级工资" prop="jiangjinJine">
            <el-input v-model="ruleForm.jiangjinJine"
                      placeholder="薪级工资" clearable :readonly="ro.jiangjinJine"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="薪级工资" prop="jiangjinJine">
              <el-input v-model="ruleForm.jiangjinJine"
                        placeholder="薪级工资" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="房帖" prop="jiangjinFangtie">
            <el-input v-model="ruleForm.jiangjinFangtie"
                      placeholder="房帖" clearable :readonly="ro.jiangjinFangtie"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="房帖" prop="jiangjinFangtie">
              <el-input v-model="ruleForm.jiangjinFangtie"
                        placeholder="房帖" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="公积金" prop="jiangjinJijin">
            <el-input v-model="ruleForm.jiangjinJijin"
                      placeholder="公积金" clearable :readonly="ro.jiangjinJijin"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="公积金" prop="jiangjinJijin">
              <el-input v-model="ruleForm.jiangjinJijin"
                        placeholder="公积金" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="业绩津贴" prop="jixiaoJine">
            <el-input v-model="ruleForm.jixiaoJine"
                      placeholder="业绩津贴" clearable :readonly="ro.jixiaoJine"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="业绩津贴" prop="jixiaoJine">
              <el-input v-model="ruleForm.jixiaoJine"
                        placeholder="业绩津贴" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="扣公积金" prop="jixiaoGongjijin">
            <el-input v-model="ruleForm.jixiaoGongjijin"
                      placeholder="扣公积金" clearable :readonly="ro.jixiaoGongjijin"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="扣公积金" prop="jixiaoGongjijin">
              <el-input v-model="ruleForm.jixiaoGongjijin"
                        placeholder="扣公积金" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="扣医保" prop="jixiaoYibao">
            <el-input v-model="ruleForm.jixiaoYibao"
                      placeholder="扣医保" clearable :readonly="ro.jixiaoYibao"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="扣医保" prop="jixiaoYibao">
              <el-input v-model="ruleForm.jixiaoYibao"
                        placeholder="扣医保" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="扣养老保险" prop="jixiaoYanglao">
            <el-input v-model="ruleForm.jixiaoYanglao"
                      placeholder="扣养老保险" clearable :readonly="ro.jixiaoYanglao"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="扣养老保险" prop="jixiaoYanglao">
              <el-input v-model="ruleForm.jixiaoYanglao"
                        placeholder="扣养老保险" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="扣失保金" prop="jixiaoShibao">
            <el-input v-model="ruleForm.jixiaoShibao"
                      placeholder="扣失保金" clearable :readonly="ro.jixiaoShibao"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="扣失保金" prop="jixiaoShibao">
              <el-input v-model="ruleForm.jixiaoShibao"
                        placeholder="扣失保金" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="扣税款" prop="jixiaoKoushui">
            <el-input v-model="ruleForm.jixiaoKoushui"
                      placeholder="扣税款" clearable :readonly="ro.jixiaoKoushui"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="扣税款" prop="jixiaoKoushui">
              <el-input v-model="ruleForm.jixiaoKoushui"
                        placeholder="扣税款" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="事假扣款" prop="jixiaoShijia">
            <el-input v-model="ruleForm.jixiaoShijia"
                      placeholder="事假扣款" clearable :readonly="ro.jixiaoShijia"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="事假扣款" prop="jixiaoShijia">
              <el-input v-model="ruleForm.jixiaoShijia"
                        placeholder="事假扣款" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
        <el-col :span="12">
          <el-form-item class="input" v-if="type!='info'" label="病假扣款" prop="jixiaoBingjia">
            <el-input v-model="ruleForm.jixiaoBingjia"
                      placeholder="病假扣款" clearable :readonly="ro.jixiaoBingjia"></el-input>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item class="input" label="病假扣款" prop="jixiaoBingjia">
              <el-input v-model="ruleForm.jixiaoBingjia"
                        placeholder="病假扣款" readonly></el-input>
            </el-form-item>
          </div>
        </el-col>
<!--        <el-col :span="12">-->
<!--          <el-form-item class="input" v-if="type!='info'" label="应扣小计" prop="xiaojiYingkou">-->
<!--            <el-input v-model="ruleForm.xiaojiYingkou"-->
<!--                      placeholder="应扣小计" clearable :readonly="ro.xiaojiYingkou"></el-input>-->
<!--          </el-form-item>-->
<!--          <div v-else-if="type=='info'">-->
<!--            <el-form-item class="input" label="应扣小计" prop="xiaojiYingkou">-->
<!--              <el-input v-model="ruleForm.xiaojiYingkou"-->
<!--                        placeholder="应扣小计" readonly></el-input>-->
<!--            </el-form-item>-->
<!--          </div>-->
<!--        </el-col>-->
<!--        <el-col :span="12">-->
<!--          <el-form-item class="input" v-if="type!='info'" label="应发小计" prop="xiaojiYingfa">-->
<!--            <el-input v-model="ruleForm.xiaojiYingfa"-->
<!--                      placeholder="应发小计" clearable :readonly="ro.xiaojiYingfa"></el-input>-->
<!--          </el-form-item>-->
<!--          <div v-else-if="type=='info'">-->
<!--            <el-form-item class="input" label="应发小计" prop="xiaojiYingfa">-->
<!--              <el-input v-model="ruleForm.xiaojiYingfa"-->
<!--                        placeholder="应发小计" readonly></el-input>-->
<!--            </el-form-item>-->
<!--          </div>-->
<!--        </el-col>-->
        <el-col :span="24">
          <el-form-item v-if="type!='info' && !ro.xinziContent" label="备注" prop="xinziContent">
            <editor style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.xinziContent"
                    class="editor"
                    action="file/upload">
            </editor>
          </el-form-item>
          <div v-else-if="type=='info'">
            <el-form-item v-if="ruleForm.xinziContent" label="备注" prop="xinziContent">
              <span v-html="ruleForm.xinziContent"></span>
            </el-form-item>
          </div>
        </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import styleJs from "../../../utils/style.js";
// 数字，邮件，手机，url，身份证校验
import {isNumber, isIntNumer, isEmail, isPhone, isMobile, isURL, checkIdCard} from "@/utils/validate";
import utilsJs, {getYearFormat, getMonthFormat, getDateFormat, getDatetimeFormat} from "../../../utils/utils.js";

export default {
  data() {
    return {
      addEditForm: null,
      id: '',
      type: '',
      sessionTable: "",//登录账户所在表名
      role: "",//权限
      userId: "",//当前登录人的id
      yonghuForm: {},
      ro: {
        yonghuId: false,
        xinziUuidNumber: true,
        xinziName: false,
        xinziMonth: false,
        jibenJine: false,
        jiangjinJine: false,
        jiangjinFangtie: false,
        jiangjinJijin: false,
        jixiaoJine: false,
        jixiaoGongjijin: false,
        jixiaoYibao: false,
        jixiaoYanglao: false,
        jixiaoShibao: false,
        jixiaoKoushui: false,
        jixiaoShijia: false,
        jixiaoBingjia: false,
        xiaojiYingkou: false,
        xiaojiYingfa: false,
        shifaJine: false,
        xinziContent: false,
        insertTime: false,
      },
      ruleForm: {
        yonghuId: '',
        xinziUuidNumber: new Date().getTime(),
        xinziName: '',
        xinziMonth: '',
        jibenJine: '',
        jiangjinJine: '',
        jiangjinFangtie: '',
        jiangjinJijin: '',
        jixiaoJine: '',
        jixiaoGongjijin: '',
        jixiaoYibao: '',
        jixiaoYanglao: '',
        jixiaoShibao: '',
        jixiaoKoushui: '',
        jixiaoShijia: '',
        jixiaoBingjia: '',
        xiaojiYingkou: '',
        xiaojiYingfa: '',
        shifaJine: '',
        xinziContent: '',
        insertTime: '',
      },
      yonghuOptions: [],
      rules: {
        yonghuId: [
          {required: true, message: '用户不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]*$/,
            message: '只允许输入整数',
            trigger: 'blur'
          }
        ],
        xinziUuidNumber: [
          {required: true, message: '薪资编号不能为空', trigger: 'blur'},
        ],
        xinziName: [
          {required: true, message: '标题不能为空', trigger: 'blur'},
        ],
        xinziMonth: [
          {required: true, message: '月份不能为空', trigger: 'blur'},
        ],
        jibenJine: [
          {required: true, message: '岗位工资不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jiangjinJine: [
          {required: true, message: '薪级工资不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jiangjinFangtie: [
          {required: true, message: '房帖不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jiangjinJijin: [
          {required: true, message: '公积金不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoJine: [
          {required: true, message: '业绩津贴不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoGongjijin: [
          {required: true, message: '扣公积金不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoYibao: [
          {required: true, message: '扣医保不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoYanglao: [
          {required: true, message: '扣养老保险不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoShibao: [
          {required: true, message: '扣失保金不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoKoushui: [
          {required: true, message: '扣税款不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoShijia: [
          {required: true, message: '事假扣款不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        jixiaoBingjia: [
          {required: true, message: '病假扣款不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        xiaojiYingkou: [
          {required: true, message: '应扣小计不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        xiaojiYingfa: [
          {required: true, message: '应发小计不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        shifaJine: [
          {required: true, message: '实发不能为空', trigger: 'blur'},
          {
            pattern: /^[0-9]{0,6}(\.[0-9]{1,2})?$/,
            message: '只允许输入整数6位,小数2位的数字',
            trigger: 'blur'
          }
        ],
        xinziContent: [
          {required: true, message: '备注不能为空', trigger: 'blur'},
        ],
        insertTime: [
          {required: true, message: '添加时间不能为空', trigger: 'blur'},
        ],
      }
    };
  },
  props: ["parent"],
  computed: {},
  created() {
    //获取当前登录用户的信息
    this.sessionTable = this.$storage.get("sessionTable");
    this.role = this.$storage.get("role");
    this.userId = this.$storage.get("userId");


    if (this.role != "管理员") {
    } else {
    }
    this.addEditForm = styleJs.addStyle();
    this.addEditStyleChange()
    this.addEditUploadStyleChange()
    //获取下拉框信息

    this.$http({
      url: `yonghu/page?page=1&limit=100`,
      method: "get"
    }).then(({data}) => {
      if (data && data.code === 0) {
        this.yonghuOptions = data.data.list;
      }
    });

  },
  mounted() {
  },
  methods: {
    // 下载
    download(file) {
      window.open(`${file}`)
    },
    // 初始化
    init(id, type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if (this.type == 'info' || this.type == 'else') {
        this.info(id);
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get("sessionTable")}/session`,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    yonghuChange(id) {
      this.$http({
        url: `yonghu/info/` + id,
        method: "get"
      }).then(({data}) => {
        if (data && data.code === 0) {
          this.yonghuForm = data.data;
        }
      });
    },
    // 多级联动参数
    info(id) {
      let _this = this;
      _this.$http({
        url: `xinzi/info/${id}`,
        method: 'get'
      }).then(({data}) => {
        if (data && data.code === 0) {
          _this.ruleForm = data.data;
          _this.yonghuChange(data.data.yonghuId)
          _this.ruleForm.xinziContent = _this.ruleForm.xinziContent.replaceAll("src=\"upload/", "src=\"" + this.$base.url + "upload/");
        } else {
          _this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.ruleForm.xinziContent = this.ruleForm.xinziContent.replaceAll(this.$base.url, "");
          this.$http({
            url: `xinzi/${!this.ruleForm.id ? "save" : "update"}`,
            method: "post",
            data: this.ruleForm
          }).then(({data}) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.parent.showFlag = true;
                  this.parent.addOrUpdateFlag = false;
                  this.parent.xinziCrossAddOrUpdateFlag = false;
                  this.parent.search();
                  this.parent.contentStyleChange();
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 获取uuid
    getUUID() {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.xinziCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    //图片

    addEditStyleChange() {
      this.$nextTick(() => {
        // input
        document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el => {
          el.style.height = this.addEditForm.inputHeight
          el.style.color = this.addEditForm.inputFontColor
          el.style.fontSize = this.addEditForm.inputFontSize
          el.style.borderWidth = this.addEditForm.inputBorderWidth
          el.style.borderStyle = this.addEditForm.inputBorderStyle
          el.style.borderColor = this.addEditForm.inputBorderColor
          el.style.borderRadius = this.addEditForm.inputBorderRadius
          el.style.backgroundColor = this.addEditForm.inputBgColor
        })
        document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.inputHeight
          el.style.color = this.addEditForm.inputLableColor
          el.style.fontSize = this.addEditForm.inputLableFontSize
        })
        // select
        document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el => {
          el.style.height = this.addEditForm.selectHeight
          el.style.color = this.addEditForm.selectFontColor
          el.style.fontSize = this.addEditForm.selectFontSize
          el.style.borderWidth = this.addEditForm.selectBorderWidth
          el.style.borderStyle = this.addEditForm.selectBorderStyle
          el.style.borderColor = this.addEditForm.selectBorderColor
          el.style.borderRadius = this.addEditForm.selectBorderRadius
          el.style.backgroundColor = this.addEditForm.selectBgColor
        })
        document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.selectHeight
          el.style.color = this.addEditForm.selectLableColor
          el.style.fontSize = this.addEditForm.selectLableFontSize
        })
        document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el => {
          el.style.color = this.addEditForm.selectIconFontColor
          el.style.fontSize = this.addEditForm.selectIconFontSize
        })
        // date
        document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el => {
          el.style.height = this.addEditForm.dateHeight
          el.style.color = this.addEditForm.dateFontColor
          el.style.fontSize = this.addEditForm.dateFontSize
          el.style.borderWidth = this.addEditForm.dateBorderWidth
          el.style.borderStyle = this.addEditForm.dateBorderStyle
          el.style.borderColor = this.addEditForm.dateBorderColor
          el.style.borderRadius = this.addEditForm.dateBorderRadius
          el.style.backgroundColor = this.addEditForm.dateBgColor
        })
        document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.dateHeight
          el.style.color = this.addEditForm.dateLableColor
          el.style.fontSize = this.addEditForm.dateLableFontSize
        })
        document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el => {
          el.style.color = this.addEditForm.dateIconFontColor
          el.style.fontSize = this.addEditForm.dateIconFontSize
          el.style.lineHeight = this.addEditForm.dateHeight
        })
        // upload
        let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
        document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el => {
          el.style.width = this.addEditForm.uploadHeight
          el.style.height = this.addEditForm.uploadHeight
          el.style.borderWidth = this.addEditForm.uploadBorderWidth
          el.style.borderStyle = this.addEditForm.uploadBorderStyle
          el.style.borderColor = this.addEditForm.uploadBorderColor
          el.style.borderRadius = this.addEditForm.uploadBorderRadius
          el.style.backgroundColor = this.addEditForm.uploadBgColor
        })
        document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el => {
          el.style.lineHeight = this.addEditForm.uploadHeight
          el.style.color = this.addEditForm.uploadLableColor
          el.style.fontSize = this.addEditForm.uploadLableFontSize
        })
        document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el => {
          el.style.color = this.addEditForm.uploadIconFontColor
          el.style.fontSize = this.addEditForm.uploadIconFontSize
          el.style.lineHeight = iconLineHeight
          el.style.display = 'block'
        })
        // 多文本输入框
        document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el => {
          el.style.height = this.addEditForm.textareaHeight
          el.style.color = this.addEditForm.textareaFontColor
          el.style.fontSize = this.addEditForm.textareaFontSize
          el.style.borderWidth = this.addEditForm.textareaBorderWidth
          el.style.borderStyle = this.addEditForm.textareaBorderStyle
          el.style.borderColor = this.addEditForm.textareaBorderColor
          el.style.borderRadius = this.addEditForm.textareaBorderRadius
          el.style.backgroundColor = this.addEditForm.textareaBgColor
        })
        document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el => {
          // el.style.lineHeight = this.addEditForm.textareaHeight
          el.style.color = this.addEditForm.textareaLableColor
          el.style.fontSize = this.addEditForm.textareaLableFontSize
        })
        // 保存
        document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el => {
          el.style.width = this.addEditForm.btnSaveWidth
          el.style.height = this.addEditForm.btnSaveHeight
          el.style.color = this.addEditForm.btnSaveFontColor
          el.style.fontSize = this.addEditForm.btnSaveFontSize
          el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
          el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
          el.style.borderColor = this.addEditForm.btnSaveBorderColor
          el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
          el.style.backgroundColor = this.addEditForm.btnSaveBgColor
        })
        // 返回
        document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el => {
          el.style.width = this.addEditForm.btnCancelWidth
          el.style.height = this.addEditForm.btnCancelHeight
          el.style.color = this.addEditForm.btnCancelFontColor
          el.style.fontSize = this.addEditForm.btnCancelFontSize
          el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
          el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
          el.style.borderColor = this.addEditForm.btnCancelBorderColor
          el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
          el.style.backgroundColor = this.addEditForm.btnCancelBgColor
        })
      })
    },
    addEditUploadStyleChange() {
      this.$nextTick(() => {
        document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el => {
          el.style.width = this.addEditForm.uploadHeight
          el.style.height = this.addEditForm.uploadHeight
          el.style.borderWidth = this.addEditForm.uploadBorderWidth
          el.style.borderStyle = this.addEditForm.uploadBorderStyle
          el.style.borderColor = this.addEditForm.uploadBorderColor
          el.style.borderRadius = this.addEditForm.uploadBorderRadius
          el.style.backgroundColor = this.addEditForm.uploadBgColor
        })
      })
    },
  }
};
</script>
<style lang="scss">
.editor {
  height: 500px;

  & /deep/ .ql-container {
    height: 310px;
  }
}

.amap-wrapper {
  width: 100%;
  height: 500px;
}

.search-box {
  position: absolute;
}

.addEdit-block {
  margin: -10px;
}

.detail-form-content {
  padding: 12px;
  background-color: transparent;
}

.btn .el-button {
  padding: 0;
}</style>

