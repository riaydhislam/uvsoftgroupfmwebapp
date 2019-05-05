package uvsoftgroup.uvsoftgroupurgtnwebapp.utility;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;


public class UserRoleIdGenerator implements IdentifierGenerator {
  
	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		long prefix = 200;
		Connection connection = session.connection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT nextval ('seq_userrole') as seqId");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("seqId");
				long code = prefix + id;
				return code;
			}

		} catch (SQLException e) {
			throw new HibernateException("Unable to generate User Role Id Sequence");
		}
		return null;
	}
}
