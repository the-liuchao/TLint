package com.gzsll.hupu.support.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.gzsll.hupu.support.db.DBThreadReplyItem;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table DBTHREAD_REPLY_ITEM.
*/
public class DBThreadReplyItemDao extends AbstractDao<DBThreadReplyItem, Long> {

    public static final String TABLENAME = "DBTHREAD_REPLY_ITEM";

    /**
     * Properties of entity DBThreadReplyItem.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ServerId = new Property(1, Long.class, "serverId", false, "SERVER_ID");
        public final static Property Pid = new Property(2, Long.class, "pid", false, "PID");
        public final static Property CreateAt = new Property(3, String.class, "createAt", false, "CREATE_AT");
        public final static Property Lights = new Property(4, Integer.class, "lights", false, "LIGHTS");
        public final static Property Floor = new Property(5, Integer.class, "floor", false, "FLOOR");
        public final static Property GroupThreadId = new Property(6, Long.class, "groupThreadId", false, "GROUP_THREAD_ID");
        public final static Property UserId = new Property(7, Long.class, "userId", false, "USER_ID");
        public final static Property Content = new Property(8, String.class, "content", false, "CONTENT");
        public final static Property IsHot = new Property(9, Boolean.class, "isHot", false, "IS_HOT");
    };


    public DBThreadReplyItemDao(DaoConfig config) {
        super(config);
    }
    
    public DBThreadReplyItemDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'DBTHREAD_REPLY_ITEM' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'SERVER_ID' INTEGER," + // 1: serverId
                "'PID' INTEGER," + // 2: pid
                "'CREATE_AT' TEXT," + // 3: createAt
                "'LIGHTS' INTEGER," + // 4: lights
                "'FLOOR' INTEGER," + // 5: floor
                "'GROUP_THREAD_ID' INTEGER," + // 6: groupThreadId
                "'USER_ID' INTEGER," + // 7: userId
                "'CONTENT' TEXT," + // 8: content
                "'IS_HOT' INTEGER);"); // 9: isHot
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'DBTHREAD_REPLY_ITEM'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, DBThreadReplyItem entity) {
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
 
        String createAt = entity.getCreateAt();
        if (createAt != null) {
            stmt.bindString(4, createAt);
        }
 
        Integer lights = entity.getLights();
        if (lights != null) {
            stmt.bindLong(5, lights);
        }
 
        Integer floor = entity.getFloor();
        if (floor != null) {
            stmt.bindLong(6, floor);
        }
 
        Long groupThreadId = entity.getGroupThreadId();
        if (groupThreadId != null) {
            stmt.bindLong(7, groupThreadId);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(8, userId);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(9, content);
        }
 
        Boolean isHot = entity.getIsHot();
        if (isHot != null) {
            stmt.bindLong(10, isHot ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public DBThreadReplyItem readEntity(Cursor cursor, int offset) {
        DBThreadReplyItem entity = new DBThreadReplyItem( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // serverId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // pid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // createAt
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // lights
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // floor
            cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6), // groupThreadId
            cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // userId
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // content
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0 // isHot
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, DBThreadReplyItem entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setServerId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setPid(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setCreateAt(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLights(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setFloor(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setGroupThreadId(cursor.isNull(offset + 6) ? null : cursor.getLong(offset + 6));
        entity.setUserId(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setContent(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setIsHot(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(DBThreadReplyItem entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(DBThreadReplyItem entity) {
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
