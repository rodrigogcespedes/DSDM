package com.example.casotres.config;

import org.hibernate.envers.RevisionListener;

import com.example.casotres.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
