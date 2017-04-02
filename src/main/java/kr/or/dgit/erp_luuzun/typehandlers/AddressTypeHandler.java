package kr.or.dgit.erp_luuzun.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.erp_luuzun.dto.Address;

public class AddressTypeHandler extends BaseTypeHandler<Address> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Address parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Address getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Address(rs.getString(columnName));
	}

	@Override
	public Address getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Address(rs.getString(columnIndex));
	}

	@Override
	public Address getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Address(cs.getString(columnIndex));
	}

}

