USE [SinemaDB]
GO
/****** Object:  Table [dbo].[KoltukMod]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KoltukMod](
	[KoltukID] [int] NOT NULL,
	[SeansID] [int] NOT NULL,
	[Tarih] [date] NOT NULL,
	[Dolu] [bit] NOT NULL,
 CONSTRAINT [PK_KoltukMod] PRIMARY KEY CLUSTERED 
(
	[KoltukID] ASC,
	[SeansID] ASC,
	[Tarih] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblBilet]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblBilet](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[FilmID] [int] NOT NULL,
	[SeansID] [int] NOT NULL,
	[KoltukID] [int] NOT NULL,
	[SatisID] [int] NOT NULL,
 CONSTRAINT [PK_tblBilet] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblCalisan]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblCalisan](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[AdiSoyadi] [varchar](50) NOT NULL,
	[KimlikNo] [varchar](11) NOT NULL,
	[KullaniciAdi] [varchar](50) NOT NULL,
	[Sifre] [varchar](50) NOT NULL,
	[Yetkiid] [int] NOT NULL,
 CONSTRAINT [PK_tblCalisan] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblFilm]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblFilm](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Adi] [varchar](50) NOT NULL,
	[KategoriID] [int] NOT NULL,
	[UcBoyutlu] [bit] NOT NULL,
	[Altyazili] [bit] NOT NULL,
	[Sure] [int] NOT NULL,
	[YonetmenID] [int] NOT NULL,
	[Afis] [image] NULL,
	[Aciklama] [varchar](max) NULL,
	[Fiyat] [float] NULL,
 CONSTRAINT [PK_tblFilm] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblKategori]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblKategori](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Adi] [varchar](50) NOT NULL,
 CONSTRAINT [PK_tblKategori] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblKoltuk]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblKoltuk](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[KoltukNo] [varchar](3) NOT NULL,
	[SalonID] [int] NOT NULL,
 CONSTRAINT [PK_tblKoltuk] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblSalon]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSalon](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Adi] [varchar](50) NOT NULL,
	[Sira] [int] NOT NULL,
	[Genislik] [int] NOT NULL,
 CONSTRAINT [PK_tblSalon] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblSatis]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSatis](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[CalisanID] [int] NOT NULL,
	[Tarih] [date] NOT NULL,
	[Tutar] [float] NOT NULL,
	[SatisTarih] [datetime] NOT NULL,
 CONSTRAINT [PK_tblSatis] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblSeans]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblSeans](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Saat] [time](7) NOT NULL,
 CONSTRAINT [PK_tblSeans] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblYetki]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblYetki](
	[Yetkiid] [int] IDENTITY(1,1) NOT NULL,
	[yetki] [varchar](20) NULL,
 CONSTRAINT [PK_tblYetki] PRIMARY KEY CLUSTERED 
(
	[Yetkiid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblYonetmen]    Script Date: 31.05.2020 17:46:29 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblYonetmen](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Adi] [varchar](50) NOT NULL,
 CONSTRAINT [PK_tblYonetmen] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[tblFilm] ADD  CONSTRAINT [DF_tblFilm_Aciklama]  DEFAULT ('') FOR [Aciklama]
GO
ALTER TABLE [dbo].[tblSatis] ADD  CONSTRAINT [DF_tblSatis_SatisTarih]  DEFAULT (getdate()) FOR [SatisTarih]
GO
ALTER TABLE [dbo].[KoltukMod]  WITH CHECK ADD  CONSTRAINT [FK_KoltukMod_tblKoltuk] FOREIGN KEY([KoltukID])
REFERENCES [dbo].[tblKoltuk] ([ID])
GO
ALTER TABLE [dbo].[KoltukMod] CHECK CONSTRAINT [FK_KoltukMod_tblKoltuk]
GO
ALTER TABLE [dbo].[KoltukMod]  WITH CHECK ADD  CONSTRAINT [FK_KoltukMod_tblSeans] FOREIGN KEY([SeansID])
REFERENCES [dbo].[tblSeans] ([ID])
GO
ALTER TABLE [dbo].[KoltukMod] CHECK CONSTRAINT [FK_KoltukMod_tblSeans]
GO
ALTER TABLE [dbo].[tblBilet]  WITH CHECK ADD  CONSTRAINT [FK_tblBilet_tblFilm] FOREIGN KEY([FilmID])
REFERENCES [dbo].[tblFilm] ([ID])
GO
ALTER TABLE [dbo].[tblBilet] CHECK CONSTRAINT [FK_tblBilet_tblFilm]
GO
ALTER TABLE [dbo].[tblBilet]  WITH CHECK ADD  CONSTRAINT [FK_tblBilet_tblKoltuk] FOREIGN KEY([KoltukID])
REFERENCES [dbo].[tblKoltuk] ([ID])
GO
ALTER TABLE [dbo].[tblBilet] CHECK CONSTRAINT [FK_tblBilet_tblKoltuk]
GO
ALTER TABLE [dbo].[tblBilet]  WITH CHECK ADD  CONSTRAINT [FK_tblBilet_tblSatis] FOREIGN KEY([SatisID])
REFERENCES [dbo].[tblSatis] ([ID])
GO
ALTER TABLE [dbo].[tblBilet] CHECK CONSTRAINT [FK_tblBilet_tblSatis]
GO
ALTER TABLE [dbo].[tblBilet]  WITH CHECK ADD  CONSTRAINT [FK_tblBilet_tblSeans] FOREIGN KEY([SeansID])
REFERENCES [dbo].[tblSeans] ([ID])
GO
ALTER TABLE [dbo].[tblBilet] CHECK CONSTRAINT [FK_tblBilet_tblSeans]
GO
ALTER TABLE [dbo].[tblCalisan]  WITH CHECK ADD  CONSTRAINT [FK_tblCalisan_tblYetki] FOREIGN KEY([Yetkiid])
REFERENCES [dbo].[tblYetki] ([Yetkiid])
GO
ALTER TABLE [dbo].[tblCalisan] CHECK CONSTRAINT [FK_tblCalisan_tblYetki]
GO
ALTER TABLE [dbo].[tblFilm]  WITH CHECK ADD  CONSTRAINT [FK_tblFilm_tblKategori] FOREIGN KEY([KategoriID])
REFERENCES [dbo].[tblKategori] ([ID])
GO
ALTER TABLE [dbo].[tblFilm] CHECK CONSTRAINT [FK_tblFilm_tblKategori]
GO
ALTER TABLE [dbo].[tblFilm]  WITH CHECK ADD  CONSTRAINT [FK_tblFilm_tblYonetmen] FOREIGN KEY([YonetmenID])
REFERENCES [dbo].[tblYonetmen] ([ID])
GO
ALTER TABLE [dbo].[tblFilm] CHECK CONSTRAINT [FK_tblFilm_tblYonetmen]
GO
ALTER TABLE [dbo].[tblKoltuk]  WITH CHECK ADD  CONSTRAINT [FK_tblKoltuk_tblSalon] FOREIGN KEY([SalonID])
REFERENCES [dbo].[tblSalon] ([ID])
GO
ALTER TABLE [dbo].[tblKoltuk] CHECK CONSTRAINT [FK_tblKoltuk_tblSalon]
GO
ALTER TABLE [dbo].[tblSatis]  WITH CHECK ADD  CONSTRAINT [FK_tblSatis_tblCalisan] FOREIGN KEY([CalisanID])
REFERENCES [dbo].[tblCalisan] ([ID])
GO
ALTER TABLE [dbo].[tblSatis] CHECK CONSTRAINT [FK_tblSatis_tblCalisan]
GO
ALTER TABLE [dbo].[tblYetki]  WITH CHECK ADD  CONSTRAINT [FK_tblYetki_tblYetki] FOREIGN KEY([Yetkiid])
REFERENCES [dbo].[tblYetki] ([Yetkiid])
GO
ALTER TABLE [dbo].[tblYetki] CHECK CONSTRAINT [FK_tblYetki_tblYetki]
GO
