package com.gzsll.hupu.support.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.gzsll.hupu.support.db.DBMiniReplyListItem;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table DBMINI_REPLY_LIST_ITEM.
*/
public class DBMiniReplyListItemDao extends AbstractDao<DBMiniReplyListItem, Long> {

    public static final String TABLENAME = "DBMINI_REPLY_LIST_ITEM";

    /**
     * Properties of entity DBMiniReplyListItem.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ServerId = new Property(1, Long.class, "serverId", false, "SERVER_ID");
        public final static Property Pid = new Property(2, Long.class, "pid", false, "PID");
        public final static Property FormatTime = new Property(3, String.class, "formatTime", false, "FORMAT_TIME");
        public final static Property GroupThreadId = new Property(4, Long.class, "groupThreadId", false, "GROUP_THREAD_ID");
        public final static Property UserId = new Property(5, Long.class, "userId", false, "USER_ID");
        public final static Property Content = new Property(6, String.class, "content", false, "CONTENT");
        public final static Property ParentReplyId = new Property(7, Long.class, "parentReplyId", false, "PARENT_REPLY_ID");
    };


    public DBMiniReplyListItemDao(DaoConfig config) {
        super(config);
    }
    
    public DBMiniReplyListItemDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'DBMINI_REPLY_LIST_ITEM' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'SERVER_ID' INTEGER," + // 1: serverId
                "'PID' INTEGER," + // 2: pid
                "'FORMAT_TIME' TEXT," + // 3: formatTime
                "'GROUP_THREAD_ID' INTEGER," + // 4: groupThreadId
                "'USER_ID' INTEGER," + // 5: userId
                "'CONTENT' TEXT," + // 6: content
                "'PARENT_REPLY_ID' INTEGER);"); // 7: parentReplyId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'DBMINI_REPLY_LIST_ITEM'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, DBMiniReplyListItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long serverId = entity.getServerId();
        if (serverId != null) {
            stmt.bindLong(2, serverId);
        }
 
        Long pid = entity.getPid();
        if (pid != null) {
            stmt.bindLong(3, pid);
        }
 
        String formatTime = entity.getFormatTime();
        if (formatTime != null) {
            stmt.bindString(4, formatTime);
        }
 
        Long groupThreadId = entity.getGroupThreadId();
        if (groupThreadId != null) {
            stmt.bindLong(5, groupThreadId);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(6, userId);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(7, content);
        }
 
        Long parentReplyId = entity.getParentReplyId();
        if (parentReplyId != null) {
            stmt.bindLong(8, parentReplyId);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public DBMiniReplyListItem readEntity(Cursor cursor, int offset) {
        DBMiniReplyListItem entity = new DBMiniReplyListItem( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // serverId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // pid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // formatTime
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // groupThreadId
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // userId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // content
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7) // parentReplyId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, DBMiniReplyListItem entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setServerId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setPid(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setFormatTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGroupThreadId(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setUserId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setContent(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setParentReplyId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(DBMiniReplyListItem entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(DBMiniReplyListItem entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
