> Last Updated: October 18th, 2025

# KrossKube

A Model-Driven Engineering (MDE) solution to generate high-level Custom Resource Definitions (CRDs) for standardized, multi-cluster management of base Kubernetes-native resources.

---

KrossKube provides a declarative approach to managing Kubernetes resources across multiple clusters through:

- **Model-Driven CRD Generation**: Automatically generate CRDs from high-level models
- **Multi-Cluster Orchestration**: Standardized resource management across different Kubernetes clusters
- **Resource Abstraction**: High-level abstractions over the native Kubernetes resources
- **Policy-Driven Deployment**: Consistent deployment patterns

## Table of Contents

### [Section I: Foundation & Architecture](#i-foundation--architecture)

1. [Overview](#1-overview)
    - [1.1 Problem Statement](#11-problem-statement)
    - [1.2 Solution Approach](#12-solution-approach)

2. [Architecture](#2-architecture)
    - [2.1 Model-Driven Engineering Foundation](#21-model-driven-engineering-foundation)
        - [2.1.1 Metamodel Layer](#211-metamodel-layer)
        - [2.1.2 Model Layer](#212-model-layer)
        - [2.1.3 Object Constraint Language (OCL)](#213-object-constaint-language-ocl)
        - [2.1.3 Code Generation Layer](#213-code-generation-layer)
    - [2.2 System Architecture](#22-system-architecture)

3. [Metamodel](#3-metamodel)
    - [3.1 Core Concepts](#31-core-concepts)
        - [3.1.1 Abstract Base Classes](#311-abstract-base-classes)
        - [3.1.2 Resource Hierarchy](#312-resource-hierarchy)
        - [3.1.3 Constraint System](#313-constraint-system)
    - [3.2 Resource Types](#32-resource-types)
        - [3.2.1 Workload Resources](#321-workload-resources)
        - [3.2.2 Network Resources](#322-network-resources)
        - [3.2.3 Storage Resources](#323-storage-resources)
        - [3.2.4 Security Resources](#324-security-resources)

### [Section II: Custom Resources & Multi-Cluster Entities](#ii-custom-resources--multi-cluster-entities)

4. [Custom Resources](#4-custom-resources)
    - [4.1 MultiClusterWorkload](#41-multiclusterworkload)
        - [4.1.1 MultiClusterPod](#411-multiclusterpod)
        - [4.1.2 MultiClusterDeployment](#412-multiclusterdeployment)
        - [4.1.3 MultiClusterStatefulSet](#413-multiclusterstatefulset)
        - [4.1.4 MultiClusterDaemonSet](#414-multiclusterdaemonset)
        - [4.1.5 MultiClusterCronJob](#415-multiclustercronjob)
    - [4.2 MultiClusterNetwork](#42-multiclusternetwork)
        - [4.2.1 MultiClusterService](#421-multiclusterservice)
        - [4.2.2 MultiClusterIngress](#422-multiclusteringress)
    - [4.3 MultiClusterStorage](#43-multiclusterstorage)
        - [4.3.1 MultiClusterPersistentVolume](#431-multiclusterpersistentvolume)
        - [4.3.2 MultiClusterPersistentVolumeClaim](#432-multiclusterpersistentvolumeclaim)
    - [4.4 MultiClusterSecurity](#44-multiclustersecurity)
        - [4.4.1 MultiClusterRole](#441-multiclusterrole)
        - [4.4.2 MultiClusterRoleBinding](#442-multiclusterrolebinding)
        - [4.4.3 MultiClusterSecret](#443-multiclustersecret)
        - [4.4.4 MultiClusterConfigMap](#444-multiclusterconfigmap)

### [Section III: Implementation & Deployment](#iii-implementation--deployment)

5. [Code Generation](#5-code-generation)
    - [5.1 Generation Strategy](#51-generation-strategy)
        - [5.1.1 Template-Based Generation](#511-template-based-generation)
        - [5.1.2 Model-to-Model Transformations](#512-model-to-model-transformations)
        - [5.1.3 Validation and Verification](#513-validation-and-verification)
    - [5.2 Target Artifacts](#52-target-artifacts)
        - [5.2.1 Custom Resource Definitions](#521-custom-resource-definitions)

6. [Installation](#6-installation)
    - [6.1 Prerequisites](#61-prerequisites)
    - [6.2 Installation Methods](#62-installation-methods)
        - [6.2.1 Binary Installation](#621-binary-installation)
        - [6.2.2 Container Installation](#622-container-installation)
        - [6.2.3 Source Installation](#623-source-installation)

### [Section IV: Usage & Reference](#iv-usage--reference)

7. [Examples](#7-examples)
    - [7.1 Basic Examples](#71-basic-examples)
        - [7.1.1 Simple Multi-Cluster Pod](#711-simple-multi-cluster-pod)
        - [7.1.2 Load-Balanced Service](#712-load-balanced-service)
        - [7.1.3 Stateful Application](#713-stateful-application)
    - [7.2 Advanced Examples](#72-advanced-examples)
        - [7.2.1 Multi-Region Web Application](#721-multi-region-web-application)
        - [7.2.2 Database Cluster with Replication](#722-database-cluster-with-replication)

8. [Acknowledgments](#8-acknowledgments)

