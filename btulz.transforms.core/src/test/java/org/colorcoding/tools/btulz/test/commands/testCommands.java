package org.colorcoding.tools.btulz.test.commands;

import java.io.File;
import java.util.ArrayList;

import org.colorcoding.tools.btulz.Console;
import org.colorcoding.tools.btulz.commands.Command4Code;
import org.colorcoding.tools.btulz.commands.Command4Ds;
import org.colorcoding.tools.btulz.commands.Command4Sql;

import junit.framework.TestCase;

public class testCommands extends TestCase {

	public void testConsole() {
		Console.main(new String[] {});
	}

	// code -TemplateFolder=eclipse/ibas_classic
	// -OutputFolder=%ibasWorkspace%\temp -GroupId=org.colorcoding
	// -ArtifactId=ibas -ProjectVersion=0.0.1 -ProjectUrl=http://colorcoding.org
	// -Domains=%ibasWorkspace%\initialization
	// -Parameters=[{"name":"ibasVersion","value":"0.1.1"},{"name":"jerseyVersion","value":"2.22.1"}]

	public void testCommandCode() {
		ArrayList<String> args = new ArrayList<>();
		args.add(String.format(Command4Code.COMMAND_PROMPT)); // 命令
		args.add(String.format("-TemplateFolder=%s", "eclipse/ibas_classic")); // 使用的模板
		args.add(String.format("-OutputFolder=%s", System.getenv("ibasWorkspace") + File.separator + "temp")); // 输出目录
		args.add(String.format("-GroupId=%s", "org.colorcoding"));// 组标记
		args.add(String.format("-ArtifactId=%s", "ibas"));// 项目标记
		// args.add(String.format("-ProjectId=%s",
		// UUID.randomUUID().toString()));// 项目版本
		args.add(String.format("-ProjectVersion=%s", "0.0.1"));// 项目版本
		args.add(String.format("-ProjectUrl=%s", "http://colorcoding.org"));// 项目地址
		args.add(String.format("-Domains=%s", System.getenv("ibasWorkspace") + File.separator + "initialization")); // 模型文件
		args.add(String.format("-Parameters=%s",
				"[{\"name\":\"ibasVersion\",\"value\":\"0.1.1\"},{\"name\":\"jerseyVersion\",\"value\":\"2.22.1\"}]")); // 其他参数
		System.out.println("显示帮助信息：");
		Console.main(new String[] { Command4Code.COMMAND_PROMPT, Command4Code.ARGUMENT_NAME_HELP });
		System.out.println("开始运行：");
		Console.main(args.toArray(new String[] {}));
	}

	// ds -TemplateFile=ds_mysql_ibas_classic.xml -Company=CC
	// -DbServer=ibas-dev-mysql -DbPort=3306 -DbSchema= -DbName=ibas_demo
	// -DbUser=root -DbPassword=1q2w3e -Domains=%ibasWorkspace%\initialization
	// -Release
	public void testCommandDs() {
		ArrayList<String> args = new ArrayList<>();
		args.add(String.format(Command4Ds.COMMAND_PROMPT)); // 命令
		args.add(String.format("-TemplateFile=%s", "ds_mysql_ibas_classic.xml")); // 使用的模板
		args.add(String.format("-Company=%s", "CC")); // 公司
		args.add(String.format("-DbServer=%s", "ibas-dev-mysql"));// 数据库地址
		args.add(String.format("-DbPort=%s", "3306"));// 数据库端口
		args.add(String.format("-DbSchema=%s", ""));// 数据库架构
		args.add(String.format("-DbName=%s", "ibas_demo_" + this.hashCode()));// 数据库名称
		args.add(String.format("-DbUser=%s", "root")); // 用户
		args.add(String.format("-DbPassword=%s", "1q2w3e")); // 密码
		args.add(String.format("-Domains=%s", System.getenv("ibasWorkspace") + File.separator + "initialization"));// 模型文件
		args.add(String.format("-Release")); // 释放资源
		System.out.println("显示帮助信息：");
		Console.main(new String[] { Command4Ds.COMMAND_PROMPT, Command4Ds.ARGUMENT_NAME_HELP });
		System.out.println("开始运行：");
		Console.main(args.toArray(new String[] {}));
	}

	// sql
	// -TemplateFile=%ibasWorkspace%\initialization\sql_mysql_ibas_initialization.xml
	// -Company=CC -DbServer=ibas-dev-mysql -DbPort=3306 -DbSchema=
	// -DbName=ibas_demo
	// -DbUser=root -DbPassword=1q2w3e
	public void testCommandSql() {
		ArrayList<String> args = new ArrayList<>();
		args.add(String.format(Command4Sql.COMMAND_PROMPT)); // 命令
		args.add(String.format("-SqlFile=%s", System.getenv("ibasWorkspace") + File.separator + "initialization"
				+ File.separator + "sql_mssql_ibas_initialization.xml")); // 使用的模板
		args.add(String.format("-Company=%s", "CC")); // 公司
		args.add(String.format("-DbServer=%s", "ibas-dev-mysql"));// 数据库地址
		args.add(String.format("-DbPort=%s", "3306"));// 数据库端口
		args.add(String.format("-DbSchema=%s", ""));// 数据库架构
		args.add(String.format("-DbName=%s", "ibas_demo_" + this.hashCode()));// 数据库名称
		args.add(String.format("-DbUser=%s", "root")); // 用户
		args.add(String.format("-DbPassword=%s", "1q2w3e")); // 密码
		System.out.println("显示帮助信息：");
		Console.main(new String[] { Command4Sql.COMMAND_PROMPT, Command4Sql.ARGUMENT_NAME_HELP });
		System.out.println("开始运行：");
		Console.main(args.toArray(new String[] {}));
	}
}
