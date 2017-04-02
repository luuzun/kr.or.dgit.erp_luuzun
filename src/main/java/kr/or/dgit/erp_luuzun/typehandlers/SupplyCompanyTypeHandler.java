/*package kr.or.dgit.erp_luuzun.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.erp_luuzun.dto.Address;
import kr.or.dgit.erp_luuzun.dto.SupplyCompany;

public class SupplyCompanyTypeHandler extends BaseTypeHandler<SupplyCompany> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, SupplyCompany parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public SupplyCompany getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new SupplyCompany(rs.getString(columnName));
	}

	@Override
	public SupplyCompany getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new SupplyCompany(rs.getString(columnIndex));
	}

	@Override
	public SupplyCompany getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new SupplyCompany(cs.getString(columnIndex));
	}

}*/

