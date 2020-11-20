package com.example.demo.config;

import org.hibernate.envers.RevisionListener;

import com.example.demo.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
