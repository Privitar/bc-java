package org.bouncycastle.pqc.crypto.util;

import java.util.HashMap;
import java.util.Map;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.util.Integers;

class Utils
{
    static final AlgorithmIdentifier AlgID_qTESLA_p_I = new AlgorithmIdentifier(PQCObjectIdentifiers.qTESLA_p_I);
    static final AlgorithmIdentifier AlgID_qTESLA_p_III = new AlgorithmIdentifier(PQCObjectIdentifiers.qTESLA_p_III);

    static final AlgorithmIdentifier SPHINCS_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
    static final AlgorithmIdentifier SPHINCS_SHA512_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);

    static final AlgorithmIdentifier XMSS_SHA256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    static final AlgorithmIdentifier XMSS_SHA512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
    static final AlgorithmIdentifier XMSS_SHAKE128 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
    static final AlgorithmIdentifier XMSS_SHAKE256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);

    static final Map categories = new HashMap();

    static final Map picnicOids = new HashMap();
    static final Map picnicParams = new HashMap();

    static final Map frodoOids = new HashMap();
    static final Map frodoParams = new HashMap();

    static final Map saberOids = new HashMap();
    static final Map saberParams = new HashMap();

    static final Map mcElieceOids = new HashMap();
    static final Map mcElieceParams = new HashMap();

    static final Map sphincsPlusOids = new HashMap();
    static final Map sphincsPlusParams = new HashMap();

    static final Map sikeOids = new HashMap();
    static final Map sikeParams = new HashMap();

    static final Map ntruOids = new HashMap();
    static final Map ntruParams = new HashMap();

    static final Map falconOids = new HashMap();
    static final Map falconParams = new HashMap();

    static final Map kyberOids = new HashMap();
    static final Map kyberParams = new HashMap();

    static final Map ntruprimeOids = new HashMap();
    static final Map ntruprimeParams = new HashMap();

    static final Map dilithiumOids = new HashMap();
    static final Map dilithiumParams = new HashMap();

    static
    {
        categories.put(PQCObjectIdentifiers.qTESLA_p_I, Integers.valueOf(QTESLASecurityCategory.PROVABLY_SECURE_I));
        categories.put(PQCObjectIdentifiers.qTESLA_p_III, Integers.valueOf(QTESLASecurityCategory.PROVABLY_SECURE_III));


        mcElieceOids.put(CMCEParameters.mceliece348864r3, BCObjectIdentifiers.mceliece348864_r3);
        mcElieceOids.put(CMCEParameters.mceliece348864fr3, BCObjectIdentifiers.mceliece348864f_r3);
        mcElieceOids.put(CMCEParameters.mceliece460896r3, BCObjectIdentifiers.mceliece460896_r3);
        mcElieceOids.put(CMCEParameters.mceliece460896fr3, BCObjectIdentifiers.mceliece460896f_r3);
        mcElieceOids.put(CMCEParameters.mceliece6688128r3, BCObjectIdentifiers.mceliece6688128_r3);
        mcElieceOids.put(CMCEParameters.mceliece6688128fr3, BCObjectIdentifiers.mceliece6688128f_r3);
        mcElieceOids.put(CMCEParameters.mceliece6960119r3, BCObjectIdentifiers.mceliece6960119_r3);
        mcElieceOids.put(CMCEParameters.mceliece6960119fr3, BCObjectIdentifiers.mceliece6960119f_r3);
        mcElieceOids.put(CMCEParameters.mceliece8192128r3, BCObjectIdentifiers.mceliece8192128_r3);
        mcElieceOids.put(CMCEParameters.mceliece8192128fr3, BCObjectIdentifiers.mceliece8192128f_r3);

        mcElieceParams.put(BCObjectIdentifiers.mceliece348864_r3, CMCEParameters.mceliece348864r3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece348864f_r3, CMCEParameters.mceliece348864fr3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece460896_r3, CMCEParameters.mceliece460896r3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece460896f_r3, CMCEParameters.mceliece460896fr3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece6688128_r3, CMCEParameters.mceliece6688128r3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece6688128f_r3, CMCEParameters.mceliece6688128fr3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece6960119_r3, CMCEParameters.mceliece6960119r3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece6960119f_r3, CMCEParameters.mceliece6960119fr3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece8192128_r3, CMCEParameters.mceliece8192128r3);
        mcElieceParams.put(BCObjectIdentifiers.mceliece8192128f_r3, CMCEParameters.mceliece8192128fr3);

        frodoOids.put(FrodoParameters.frodokem640aes, BCObjectIdentifiers.frodokem640aes);
        frodoOids.put(FrodoParameters.frodokem640shake, BCObjectIdentifiers.frodokem640shake);
        frodoOids.put(FrodoParameters.frodokem976aes, BCObjectIdentifiers.frodokem976aes);
        frodoOids.put(FrodoParameters.frodokem976shake, BCObjectIdentifiers.frodokem976shake);
        frodoOids.put(FrodoParameters.frodokem1344aes, BCObjectIdentifiers.frodokem1344aes);
        frodoOids.put(FrodoParameters.frodokem1344shake, BCObjectIdentifiers.frodokem1344shake);

        frodoParams.put(BCObjectIdentifiers.frodokem640aes, FrodoParameters.frodokem640aes);
        frodoParams.put(BCObjectIdentifiers.frodokem640shake, FrodoParameters.frodokem640shake);
        frodoParams.put(BCObjectIdentifiers.frodokem976aes, FrodoParameters.frodokem976aes);
        frodoParams.put(BCObjectIdentifiers.frodokem976shake, FrodoParameters.frodokem976shake);
        frodoParams.put(BCObjectIdentifiers.frodokem1344aes, FrodoParameters.frodokem1344aes);
        frodoParams.put(BCObjectIdentifiers.frodokem1344shake, FrodoParameters.frodokem1344shake);


        saberOids.put(SABERParameters.lightsaberkem128r3, BCObjectIdentifiers.lightsaberkem128r3);
        saberOids.put(SABERParameters.saberkem128r3, BCObjectIdentifiers.saberkem128r3);
        saberOids.put(SABERParameters.firesaberkem128r3, BCObjectIdentifiers.firesaberkem128r3);
        saberOids.put(SABERParameters.lightsaberkem192r3, BCObjectIdentifiers.lightsaberkem192r3);
        saberOids.put(SABERParameters.saberkem192r3, BCObjectIdentifiers.saberkem192r3);
        saberOids.put(SABERParameters.firesaberkem192r3, BCObjectIdentifiers.firesaberkem192r3);
        saberOids.put(SABERParameters.lightsaberkem256r3, BCObjectIdentifiers.lightsaberkem256r3);
        saberOids.put(SABERParameters.saberkem256r3, BCObjectIdentifiers.saberkem256r3);
        saberOids.put(SABERParameters.firesaberkem256r3, BCObjectIdentifiers.firesaberkem256r3);

        saberParams.put(BCObjectIdentifiers.lightsaberkem128r3, SABERParameters.lightsaberkem128r3);
        saberParams.put(BCObjectIdentifiers.saberkem128r3, SABERParameters.saberkem128r3);
        saberParams.put(BCObjectIdentifiers.firesaberkem128r3, SABERParameters.firesaberkem128r3);
        saberParams.put(BCObjectIdentifiers.lightsaberkem192r3, SABERParameters.lightsaberkem192r3);
        saberParams.put(BCObjectIdentifiers.saberkem192r3, SABERParameters.saberkem192r3);
        saberParams.put(BCObjectIdentifiers.firesaberkem192r3, SABERParameters.firesaberkem192r3);
        saberParams.put(BCObjectIdentifiers.lightsaberkem256r3, SABERParameters.lightsaberkem256r3);
        saberParams.put(BCObjectIdentifiers.saberkem256r3, SABERParameters.saberkem256r3);
        saberParams.put(BCObjectIdentifiers.firesaberkem256r3, SABERParameters.firesaberkem256r3);


        picnicOids.put(PicnicParameters.picnicl1fs, BCObjectIdentifiers.picnicl1fs);
        picnicOids.put(PicnicParameters.picnicl1ur, BCObjectIdentifiers.picnicl1ur);
        picnicOids.put(PicnicParameters.picnicl3fs, BCObjectIdentifiers.picnicl3fs);
        picnicOids.put(PicnicParameters.picnicl3ur, BCObjectIdentifiers.picnicl3ur);
        picnicOids.put(PicnicParameters.picnicl5fs, BCObjectIdentifiers.picnicl5fs);
        picnicOids.put(PicnicParameters.picnicl5ur, BCObjectIdentifiers.picnicl5ur);
        picnicOids.put(PicnicParameters.picnic3l1, BCObjectIdentifiers.picnic3l1);
        picnicOids.put(PicnicParameters.picnic3l3, BCObjectIdentifiers.picnic3l3);
        picnicOids.put(PicnicParameters.picnic3l5, BCObjectIdentifiers.picnic3l5);
        picnicOids.put(PicnicParameters.picnicl1full, BCObjectIdentifiers.picnicl1full);
        picnicOids.put(PicnicParameters.picnicl3full, BCObjectIdentifiers.picnicl3full);
        picnicOids.put(PicnicParameters.picnicl5full, BCObjectIdentifiers.picnicl5full);

        picnicParams.put(BCObjectIdentifiers.picnicl1fs, PicnicParameters.picnicl1fs);
        picnicParams.put(BCObjectIdentifiers.picnicl1ur, PicnicParameters.picnicl1ur);
        picnicParams.put(BCObjectIdentifiers.picnicl3fs, PicnicParameters.picnicl3fs);
        picnicParams.put(BCObjectIdentifiers.picnicl3ur, PicnicParameters.picnicl3ur);
        picnicParams.put(BCObjectIdentifiers.picnicl5fs, PicnicParameters.picnicl5fs);
        picnicParams.put(BCObjectIdentifiers.picnicl5ur, PicnicParameters.picnicl5ur);
        picnicParams.put(BCObjectIdentifiers.picnic3l1, PicnicParameters.picnic3l1);
        picnicParams.put(BCObjectIdentifiers.picnic3l3, PicnicParameters.picnic3l3);
        picnicParams.put(BCObjectIdentifiers.picnic3l5, PicnicParameters.picnic3l5);
        picnicParams.put(BCObjectIdentifiers.picnicl1full, PicnicParameters.picnicl1full);
        picnicParams.put(BCObjectIdentifiers.picnicl3full, PicnicParameters.picnicl3full);
        picnicParams.put(BCObjectIdentifiers.picnicl5full, PicnicParameters.picnicl5full);

        sikeOids.put(SIKEParameters.sikep434, BCObjectIdentifiers.sikep434);
        sikeOids.put(SIKEParameters.sikep503, BCObjectIdentifiers.sikep503);
        sikeOids.put(SIKEParameters.sikep610, BCObjectIdentifiers.sikep610);
        sikeOids.put(SIKEParameters.sikep751, BCObjectIdentifiers.sikep751);
        sikeOids.put(SIKEParameters.sikep434_compressed, BCObjectIdentifiers.sikep434_compressed);
        sikeOids.put(SIKEParameters.sikep503_compressed, BCObjectIdentifiers.sikep503_compressed);
        sikeOids.put(SIKEParameters.sikep610_compressed, BCObjectIdentifiers.sikep610_compressed);
        sikeOids.put(SIKEParameters.sikep751_compressed, BCObjectIdentifiers.sikep751_compressed);

        sikeParams.put(BCObjectIdentifiers.sikep434, SIKEParameters.sikep434);
        sikeParams.put(BCObjectIdentifiers.sikep503, SIKEParameters.sikep503);
        sikeParams.put(BCObjectIdentifiers.sikep610, SIKEParameters.sikep610);
        sikeParams.put(BCObjectIdentifiers.sikep751, SIKEParameters.sikep751);
        sikeParams.put(BCObjectIdentifiers.sikep434_compressed, SIKEParameters.sikep434_compressed);
        sikeParams.put(BCObjectIdentifiers.sikep503_compressed, SIKEParameters.sikep503_compressed);
        sikeParams.put(BCObjectIdentifiers.sikep610_compressed, SIKEParameters.sikep610_compressed);
        sikeParams.put(BCObjectIdentifiers.sikep751_compressed, SIKEParameters.sikep751_compressed);

        ntruOids.put(NTRUParameters.ntruhps2048509, BCObjectIdentifiers.ntruhps2048509);
        ntruOids.put(NTRUParameters.ntruhps2048677, BCObjectIdentifiers.ntruhps2048677);
        ntruOids.put(NTRUParameters.ntruhps4096821, BCObjectIdentifiers.ntruhps4096821);
        ntruOids.put(NTRUParameters.ntruhrss701, BCObjectIdentifiers.ntruhrss701);

        ntruParams.put(BCObjectIdentifiers.ntruhps2048509, NTRUParameters.ntruhps2048509);
        ntruParams.put(BCObjectIdentifiers.ntruhps2048677, NTRUParameters.ntruhps2048677);
        ntruParams.put(BCObjectIdentifiers.ntruhps4096821, NTRUParameters.ntruhps4096821);
        ntruParams.put(BCObjectIdentifiers.ntruhrss701, NTRUParameters.ntruhrss701);

        falconOids.put(FalconParameters.falcon_512, BCObjectIdentifiers.falcon_512);
        falconOids.put(FalconParameters.falcon_1024, BCObjectIdentifiers.falcon_1024);

        falconParams.put(BCObjectIdentifiers.falcon_512, FalconParameters.falcon_512);
        falconParams.put(BCObjectIdentifiers.falcon_1024, FalconParameters.falcon_1024);

        kyberOids.put(KyberParameters.kyber512, BCObjectIdentifiers.kyber512);
        kyberOids.put(KyberParameters.kyber768, BCObjectIdentifiers.kyber768);
        kyberOids.put(KyberParameters.kyber1024, BCObjectIdentifiers.kyber1024);

        kyberParams.put(BCObjectIdentifiers.kyber512, KyberParameters.kyber512);
        kyberParams.put(BCObjectIdentifiers.kyber768, KyberParameters.kyber768);
        kyberParams.put(BCObjectIdentifiers.kyber1024, KyberParameters.kyber1024);
        
        ntruprimeOids.put(NTRULPRimeParameters.ntrulpr653, BCObjectIdentifiers.ntrulpr653);
        ntruprimeOids.put(NTRULPRimeParameters.ntrulpr761, BCObjectIdentifiers.ntrulpr761);
        ntruprimeOids.put(NTRULPRimeParameters.ntrulpr857, BCObjectIdentifiers.ntrulpr857);
        ntruprimeOids.put(NTRULPRimeParameters.ntrulpr953, BCObjectIdentifiers.ntrulpr953);
        ntruprimeOids.put(NTRULPRimeParameters.ntrulpr1013, BCObjectIdentifiers.ntrulpr1013);
        ntruprimeOids.put(NTRULPRimeParameters.ntrulpr1277, BCObjectIdentifiers.ntrulpr1277);

        ntruprimeParams.put(BCObjectIdentifiers.ntrulpr653, NTRULPRimeParameters.ntrulpr653);
        ntruprimeParams.put(BCObjectIdentifiers.ntrulpr761, NTRULPRimeParameters.ntrulpr761);
        ntruprimeParams.put(BCObjectIdentifiers.ntrulpr857, NTRULPRimeParameters.ntrulpr857);
        ntruprimeParams.put(BCObjectIdentifiers.ntrulpr953, NTRULPRimeParameters.ntrulpr953);
        ntruprimeParams.put(BCObjectIdentifiers.ntrulpr1013, NTRULPRimeParameters.ntrulpr1013);
        ntruprimeParams.put(BCObjectIdentifiers.ntrulpr1277, NTRULPRimeParameters.ntrulpr1277);

        dilithiumOids.put(DilithiumParameters.dilithium2, BCObjectIdentifiers.dilithium2);
        dilithiumOids.put(DilithiumParameters.dilithium3, BCObjectIdentifiers.dilithium3);
        dilithiumOids.put(DilithiumParameters.dilithium5, BCObjectIdentifiers.dilithium5);

        dilithiumParams.put(BCObjectIdentifiers.dilithium2, DilithiumParameters.dilithium2);
        dilithiumParams.put(BCObjectIdentifiers.dilithium3, DilithiumParameters.dilithium3);
        dilithiumParams.put(BCObjectIdentifiers.dilithium5, DilithiumParameters.dilithium5);
    }

    static int qTeslaLookupSecurityCategory(AlgorithmIdentifier algorithm)
    {
        return ((Integer)categories.get(algorithm.getAlgorithm())).intValue();
    }

    static AlgorithmIdentifier qTeslaLookupAlgID(int securityCategory)
    {
        switch (securityCategory)
        {
        case QTESLASecurityCategory.PROVABLY_SECURE_I:
            return AlgID_qTESLA_p_I;
        case QTESLASecurityCategory.PROVABLY_SECURE_III:
            return AlgID_qTESLA_p_III;
        default:
            throw new IllegalArgumentException("unknown security category: " + securityCategory);
        }
    }

    static AlgorithmIdentifier sphincs256LookupTreeAlgID(String treeDigest)
    {
        if (treeDigest.equals(SPHINCSKeyParameters.SHA3_256))
        {
            return SPHINCS_SHA3_256;
        }
        else if (treeDigest.equals(SPHINCSKeyParameters.SHA512_256))
        {
            return SPHINCS_SHA512_256;
        }
        else
        {
            throw new IllegalArgumentException("unknown tree digest: " + treeDigest);
        }
    }

    static AlgorithmIdentifier xmssLookupTreeAlgID(String treeDigest)
    {
        if (treeDigest.equals(XMSSKeyParameters.SHA_256))
        {
            return XMSS_SHA256;
        }
        else if (treeDigest.equals(XMSSKeyParameters.SHA_512))
        {
            return XMSS_SHA512;
        }
        else if (treeDigest.equals(XMSSKeyParameters.SHAKE128))
        {
            return XMSS_SHAKE128;
        }
        else if (treeDigest.equals(XMSSKeyParameters.SHAKE256))
        {
            return XMSS_SHAKE256;
        }
        else
        {
            throw new IllegalArgumentException("unknown tree digest: " + treeDigest);
        }
    }

    static String sphincs256LookupTreeAlgName(SPHINCS256KeyParams keyParams)
    {
        AlgorithmIdentifier treeDigest = keyParams.getTreeDigest();

        if (treeDigest.getAlgorithm().equals(SPHINCS_SHA3_256.getAlgorithm()))
        {
            return SPHINCSKeyParameters.SHA3_256;
        }
        else if (treeDigest.getAlgorithm().equals(SPHINCS_SHA512_256.getAlgorithm()))
        {
            return SPHINCSKeyParameters.SHA512_256;
        }
        else
        {
            throw new IllegalArgumentException("unknown tree digest: " + treeDigest.getAlgorithm());
        }
    }

    static Digest getDigest(ASN1ObjectIdentifier oid)
    {
        if (oid.equals(NISTObjectIdentifiers.id_sha256))
        {
            return new SHA256Digest();
        }
        if (oid.equals(NISTObjectIdentifiers.id_sha512))
        {
            return new SHA512Digest();
        }
        if (oid.equals(NISTObjectIdentifiers.id_shake128))
        {
            return new SHAKEDigest(128);
        }
        if (oid.equals(NISTObjectIdentifiers.id_shake256))
        {
            return new SHAKEDigest(256);
        }

        throw new IllegalArgumentException("unrecognized digest OID: " + oid);
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(String digestName)
    {
        if (digestName.equals("SHA-1"))
        {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (digestName.equals("SHA-224"))
        {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224);
        }
        if (digestName.equals("SHA-256"))
        {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        }
        if (digestName.equals("SHA-384"))
        {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        if (digestName.equals("SHA-512"))
        {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        }

        throw new IllegalArgumentException("unrecognised digest algorithm: " + digestName);
    }

    public static String getDigestName(ASN1ObjectIdentifier digestOid)
    {
        if (digestOid.equals(OIWObjectIdentifiers.idSHA1))
        {
            return "SHA-1";
        }
        if (digestOid.equals(NISTObjectIdentifiers.id_sha224))
        {
            return "SHA-224";
        }
        if (digestOid.equals(NISTObjectIdentifiers.id_sha256))
        {
            return "SHA-256";
        }
        if (digestOid.equals(NISTObjectIdentifiers.id_sha384))
        {
            return "SHA-384";
        }
        if (digestOid.equals(NISTObjectIdentifiers.id_sha512))
        {
            return "SHA-512";
        }

        throw new IllegalArgumentException("unrecognised digest algorithm: " + digestOid);
    }

    static ASN1ObjectIdentifier sphincsPlusOidLookup(SPHINCSPlusParameters params)
    {
        int pId = SPHINCSPlusParameters.getID(params);

        if ((pId & 0x020000) == 0x020000)
        {
            return BCObjectIdentifiers.sphincsPlus_shake_256;
        }

        if ((pId & 0x05) == 0x05 || (pId & 0x06) == 0x06)
        {
            return BCObjectIdentifiers.sphincsPlus_sha_512;
        }

        return BCObjectIdentifiers.sphincsPlus_sha_256;
    }

    static ASN1ObjectIdentifier mcElieceOidLookup(CMCEParameters params)
    {
        return (ASN1ObjectIdentifier)mcElieceOids.get(params);
    }

    static CMCEParameters mcElieceParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (CMCEParameters)mcElieceParams.get(oid);
    }

    static ASN1ObjectIdentifier frodoOidLookup(FrodoParameters params)
    {
        return (ASN1ObjectIdentifier)frodoOids.get(params);
    }

    static FrodoParameters frodoParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (FrodoParameters)frodoParams.get(oid);
    }

    static ASN1ObjectIdentifier saberOidLookup(SABERParameters params)
    {
        return (ASN1ObjectIdentifier)saberOids.get(params);
    }

    static SABERParameters saberParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (SABERParameters)saberParams.get(oid);
    }

    static ASN1ObjectIdentifier picnicOidLookup(PicnicParameters params)
    {
        return (ASN1ObjectIdentifier)picnicOids.get(params);
    }

    static PicnicParameters picnicParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (PicnicParameters)picnicParams.get(oid);
    }

    static ASN1ObjectIdentifier sikeOidLookup(SIKEParameters params)
    {
        return (ASN1ObjectIdentifier)sikeOids.get(params);
    }

    static SIKEParameters sikeParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (SIKEParameters)sikeParams.get(oid);
    }

    static ASN1ObjectIdentifier falconOidLookup(FalconParameters params)
    {
        return (ASN1ObjectIdentifier)falconOids.get(params);
    }

    static FalconParameters falconParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (FalconParameters)falconParams.get(oid);
    }

    static ASN1ObjectIdentifier ntruOidLookup(NTRUParameters params)
    {
        return (ASN1ObjectIdentifier)ntruOids.get(params);
    }

    static NTRUParameters ntruParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (NTRUParameters)ntruParams.get(oid);
    }

    static ASN1ObjectIdentifier kyberOidLookup(KyberParameters params)
    {
        return (ASN1ObjectIdentifier)kyberOids.get(params);
    }

    static KyberParameters kyberParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (KyberParameters)kyberParams.get(oid);
    }
    
    static ASN1ObjectIdentifier ntrulprimeOidLookup(NTRULPRimeParameters params)
    {
        return (ASN1ObjectIdentifier)ntruprimeOids.get(params);
    }

    static NTRULPRimeParameters ntrulprimeParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (NTRULPRimeParameters)ntruprimeParams.get(oid);
    }
    
    static ASN1ObjectIdentifier dilithiumOidLookup(DilithiumParameters params)
    {
        return (ASN1ObjectIdentifier)dilithiumOids.get(params);
    }

    static DilithiumParameters dilithiumParamsLookup(ASN1ObjectIdentifier oid)
    {
        return (DilithiumParameters)dilithiumParams.get(oid);
    }
}
