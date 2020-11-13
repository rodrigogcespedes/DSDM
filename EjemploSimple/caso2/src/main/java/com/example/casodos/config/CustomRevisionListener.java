package com.example.casodos.config;

import org.hibernate.envers.RevisionListener;

import com.example.casodos.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
